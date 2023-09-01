/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.controllers;

import ec.edu.espol.cartelera.App;
import ec.edu.espol.model.Pelicula;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jonanyu 11.1
 */
public class CarteleraController implements Initializable {

    @FXML
    private HBox hpeli;
    @FXML
    private VBox Vpeli;
    @FXML
    private ComboBox<String> combo;

    private ArrayList<Pelicula> peliculas;
    @FXML
    private Label titulo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //Es donde nosotros podemos leer contenido e ir llenando de manera dinamica
        //Para llenr de manera dinamica

        peliculas = Pelicula.leerPeliculas("peliculas.ser");

        ArrayList<String> categoriasPeli = Pelicula.categoriasUnicas(peliculas);
        combo.getItems().addAll(categoriasPeli);
//        for (String c : categoriasPeli) {
//            combo.getItems().add(c);
//        }
        combo.getItems().add("Toda Categoria");
        combo.setValue("Toda Categoria");
        mostrarPeli(peliculas);
    }

    @FXML
    private void iniciar(MouseEvent event) {
        HiloIn h =new HiloIn();
        Thread t1= new Thread(h);
        t1.start();
        
    }
    
    
    
    public class HiloIn implements Runnable{

        @Override
        public void run() {
           while(true){
               Platform.runLater(new Runnable() {
                   @Override
                   public void run() {
                      titulo.setText("");
                       try {
                           Thread.sleep(1000);
                       } catch (InterruptedException ex) {
                           ex.printStackTrace();
                       }
                      titulo.setText("SUPERCINES");
                   }
               });
           }
        }
        
    }

    @FXML
    private void filtrar(ActionEvent event) {
        Vpeli.getChildren().clear();
        ComboBox cbx = (ComboBox) event.getSource();//getSource, me dice que quien fue entonces es un nodo lo hago DownCasting

        String cate = (String) cbx.getValue();
        if (cate.equals("Toda Categoria")) {
            mostrarPeli(peliculas);
        } else {
            ArrayList<Pelicula> pelFiltrada = Pelicula.filtrarCategorias(peliculas, cate);
            mostrarPeli(pelFiltrada);
        }

    }

    private void mostrarPeli(ArrayList<Pelicula> peli) {
        hpeli.getChildren().clear();
        for (Pelicula pe : peli) {

            //Cargando Imagenes, Imagenes como recursos
            Image im = new Image("img/" + pe.getNomfile());
            //Contenedor de imagen
            ImageView img = new ImageView(im);
            img.setFitWidth(184);
            img.setFitHeight(184);
            //Nosotros podemos agregar un evento 
            //Control addEventHandler agrega el evento y el manejador
            //Nosotros tenemos que darle el tipo de evento

            //Evento de Boton, Evento de MouseClick - (MouseEvent.MouseClicked, new EventHandler())
            //Queremos que de click en la imagen, ese es el evento
            //Primero Evento depues manejador, 
            //Para el manejador se crea una instancia EVentHandler
            //Ojo pero como es una interfaz el eventHndler no podemos Crear una Instancia
            //Even Handler es una interfaz, Debemos crear una clase anonima
            //Clase Anomima, la clase anonima no tiene nombre 
            //FUnciones anonimas se llaman las funciones lambda son de un uso no tienen nombre
            //Uso exclusivo donde se defina
            //A la interfaz 
            hpeli.getChildren().add(img);
            img.addEventHandler(MouseEvent.MOUSE_CLICKED, (Event t) -> {//Funcion anonima
                //Darles cuerpo ya que es abstracta
//                ImageView imv=(ImageView) t.getSource();//Nos devuelve un nodo, fuente de quien dio click
//                imv.getImage().getUrl();//Meda la imagen y me da la url
//                
//                Alert a=new Alert(Alert.AlertType.INFORMATION,imv.getImage().getUrl());//EL evento se agregar 
                //Podemos sacar la fuente del evento

                //el evento con este manejador a cada imagen
                // a.show();
                Vpeli.getChildren().clear();
                Text t1 = new Text(pe.getTitulo());
                Text t2 = new Text(pe.getSinopsis());
                t2.setWrappingWidth(300);
                t2.setTextAlignment(TextAlignment.JUSTIFY);
                Vpeli.getChildren().addAll(t1, t2);

            });

            //Podemos poner un condicional
//            ImageView im2= (ImageView) hpeli.getChildren().get(1);
//            im2.addEventHandler(MouseEvent.MOUSE_CLICKED, (Event t) -> {//Funcion anonima
//                //Darles cuerpo ya que es abstracta
//                Alert a=new Alert(Alert.AlertType.INFORMATION,"Funciona el manjador");//EL evento se agregar 
//                //el evento con este manejador a cada imagen
//                a.show();
//            });
        }

        hpeli.setSpacing(10);

    }

    @FXML
    private void seleccionar(MouseEvent event) throws IOException {
        Button b = (Button) event.getSource();//obetenemos la fuente 
        if (Vpeli.getChildren().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR, "NO ha seleccionado una pelicula");
            a.show();
        } else {
            Text title = (Text) Vpeli.getChildren().get(0);
            Pelicula p = Pelicula.filtrarTitulo(peliculas, title.getText());
            FXMLLoader loader = App.loadFXML("pelicula");
            Scene sc = new Scene(loader.load(), 640, 480);
            PeliculaController controller = loader.getController();//Me devuelve el controlador de la escena
            //Despues de cargar el grafo de escena, es como carage en el initalize
            controller.setPeli(p);
//            Stage old = (Stage) b.getScene().getWindow();//esto nos devuelve la escena referenciada
//            old.close();//ciera la vieja
//            Stage st = new Stage();
//            st.setScene(sc);
//            st.show();

            //Tenemos que 
            App.setScene(sc);
        }
    }
}
