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

        ArrayList<Receta> recetas = Receta.leerReceta();

        HBox hbox = new HBox();
        for (Receta re : recetas) {
            VBox v1 = new VBox();
            Text titulo = new Text(re.getTitulo());
            ArrayList<Text> textsIngre = new ArrayList<>();
            for (String ingre : re.getIngredientes().split("\\|")) {
                textsIngre.add(new Text(ingre));
            }
            VBox vBingr = new VBox();
            vBingr.getChildren().addAll(textsIngre);

            Text duracion = new Text("Duracion: " + Integer.toString(re.getDuracion()));
            v1.getChildren().addAll(titulo, vBingr, duracion);
            v1.addEventHandler(MouseEvent.MOUSE_CLICKED, (Event t) -> {
                preparar(re);
            });

            hbox.getChildren().add(v1);
        }

        fpRecetas.getChildren().add(hbox);
    }
    
    
    
    
    public void preparar(Receta r) {
        vbPasos.getChildren().clear();
        
        
        for (Paso pa : r.getPasos()) {
            HBox fila = new HBox();
            Image imag = new Image(pa.getImagen());
            ImageView im = new ImageView(imag);
            im.setFitHeight(50);
            im.setFitWidth(50);
            Text descripcon = new Text(pa.getDescripcion());
           
            fila.getChildren().addAll(im, descripcon);
            
            vbPasos.getChildren().add(fila);
        }

    }

}
