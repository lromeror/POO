package ec.edu.espol.examenmundial;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PrimaryController implements Initializable {

    @FXML
    private ComboBox<Equipo> ComboBox1;
    @FXML
    private ComboBox<Jugador> ComboBox2;

    private ArrayList<Equipo> lstEquipos;
    @FXML
    private Label lblMensaje;
    @FXML
    private VBox panelJugador;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.lstEquipos = Equipo.obtenerEquipos();
        for (Equipo eq : this.lstEquipos) {
            ComboBox1.getItems().add(eq);
        } 
    }
    
    public class HIloRep implements Runnable{

        @Override
        public void run() {
            try(BufferedWriter input=new BufferedWriter(new FileWriter("src/main/resources/files/datosNomina.txt"))){
                for(Equipo eq:lstEquipos){//nombreEquipo, cantidadJugadores, totalPagar.
                    input.write(eq.toString()+","+eq.getJugadores().size()+","+eq.calcularTotalSueldos()+"\n");
                    Platform.runLater(()->{
                        lblMensaje.setText(eq.toString());
                    });
                    Thread.sleep(5000);
                }
            }catch(Exception e){
            
            }
        }
    
    }

    @FXML
    private void btnGenerar(MouseEvent event) {
        HIloRep hilor1=new HIloRep();
        Thread h=new Thread(hilor1);
        h.start();
    }

    @FXML
    private void filtradoPa(ActionEvent event) {
        ComboBox2.getItems().clear();
        ComboBox cb1 = (ComboBox) event.getSource();
        Equipo valCb1 = (Equipo) cb1.getValue();
        for (Equipo eq : this.lstEquipos) {
            if (eq.equals(valCb1)) {
                for (Jugador jug : eq.getJugadores()) {
                    ComboBox2.getItems().add(jug);
                }
            }
        }
    }

    @FXML
    private void panelJuga(ActionEvent event) {
        panelJugador.getChildren().clear();
        ComboBox cb2 = (ComboBox) event.getSource();
        Jugador jugador = (Jugador) cb2.getValue();
        HBox paneJuga = new HBox();
        try{
        Label nombre = new Label("Nombre:    " + jugador.getNombre());
        Label posic = new Label("Posicion:    " + jugador.getPosicion());
        Label salario = new Label("Salario:     " + Double.toString(jugador.getSalario()));
        Image im = new Image("img/" + jugador.getNombreImagen());
        
        ImageView imInt = new ImageView(im);
        imInt.setFitWidth(150);
        imInt.setFitHeight(150);
        VBox contText = new VBox();
        contText.getChildren().addAll(nombre, posic, salario);
        paneJuga.getChildren().addAll(imInt, contText);
        paneJuga.setSpacing(20);
        paneJuga.setAlignment(Pos.CENTER);
        panelJugador.getChildren().add(paneJuga);
        }catch(Exception e){
            System.out.println("Null");
        }
    }
}
