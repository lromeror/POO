package ec.edu.espol.cartelera;

import ec.edu.espol.model.Pelicula;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("cartelera").load(), 640, 490);
        stage.setScene(scene);
        stage.setTitle("Supercines");
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml).load());
    }

    public static FXMLLoader loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader;
    }

    public static void main(String[] args) {
//        ArrayList<Pelicula> pelis=Pelicula.leerPeliculas("peliculas.ser");
//        System.out.println(pelis);
        launch();
    }

}
