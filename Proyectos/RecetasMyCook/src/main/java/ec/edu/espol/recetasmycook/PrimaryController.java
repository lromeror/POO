/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.recetasmycook;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Jonanyu 11.1
 */
public class PrimaryController implements Initializable {

    @FXML
    private Label lblTiempo;
    @FXML
    private FlowPane fpRecetas;
    @FXML
    private VBox vbPasos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        ArrayList<Receta> recetas = Receta.leerReceta();//Retorna recetas

        HBox hbox = new HBox();//Contiene por columnas las recetas
        for (Receta re : recetas) {
            VBox v1 = new VBox();//Es el que va agregando de Forma vertical
            Text titulo = new Text(re.getTitulo()+"\n");
            /*
            ArrayList<Text> textsIngre = new ArrayList<>();
            for (String ingre : re.getIngredientes().split("\\|")) {
                textsIngre.add(new Text(ingre));
            } 
            VBox vBingr = new VBox();
            vBingr.getChildren().addAll(textsIngre);*/
            Text ingred = new Text(re.getIngredientes().replace('|', '\n')+"\n");
            Text duracion = new Text("Duracion: " + Integer.toString(re.getDuracion()));
            v1.getChildren().addAll(titulo, ingred, duracion);
            v1.addEventHandler(MouseEvent.MOUSE_CLICKED, (Event t) -> {
                preparar(re);
            });

            hbox.getChildren().add(v1);
        }
        hbox.setSpacing(20);
        fpRecetas.getChildren().add(hbox);
    }

    public class HiloTiempo implements Runnable {

        private Receta re;

        public HiloTiempo(Receta r) {
            this.re = r;
        }
        //Moraleja para cambiar el grafo de escena es necesario usar el platforRunlater
        //ya que es necesario cuando usamos hilos osea que no sean el principal
        //Cuando usamos el event Handler ponemos un manejador y el evento
        
        /*
        En tu caso, parece que ambos hilos (HiloTiempo y HiloCrono) se ejecutan en segundo plano y actualizan la interfaz gráfica. 
        Dado que estos hilos no se ejecutan en el hilo principal de JavaFX, 
        es importante utilizar Platform.runLater() para las actualizaciones de la GUI, 
        como lo estás haciendo en tu código actual.
        */
        @Override
        public void run() {
            try {
                for (Paso pa : re.getPasos()) {
                    Platform.runLater(() -> {//Osea aqui desemos modificar el grafo de Escene con tiempo
                        HBox fila = new HBox();
                        Image imag = new Image(pa.getImagen());
                        ImageView im = new ImageView(imag);
                        im.setFitHeight(50);
                        im.setFitWidth(50);
                        Text descripcion = new Text(pa.getDescripcion());
                        fila.getChildren().addAll(im, descripcion);
                        vbPasos.getChildren().add(fila);
                    });
                    Thread.sleep(pa.getTiempo() * 1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public class HiloCrono implements Runnable {

        private int seg;

        public HiloCrono(int se) {
            this.seg = se - 1;
        }

        @Override
        public void run() {
            while (this.seg > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                Platform.runLater(() -> {
                    lblTiempo.setText(Integer.toString(this.seg--));
                });
            }
        }
    }

    public void preparar(Receta r) {
        vbPasos.getChildren().clear();
        this.lblTiempo.setText(Integer.toString(r.getDuracion()));
        HiloTiempo hilo1 = new HiloTiempo(r);
        Thread th1 = new Thread(hilo1);
        HiloCrono hilo2 = new HiloCrono(r.getDuracion());
        Thread th2 = new Thread(hilo2);
        th1.start();
        th2.start();
    }

}
