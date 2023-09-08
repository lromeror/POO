package ec.edu.espol.cartelera;

import ec.edu.espol.model.Hilo;
import ec.edu.espol.model.Hilo2;
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
    private static Stage st;

    @Override
    public void start(Stage stage) throws IOException {
        st = stage;
        scene = new Scene(loadFXML("cartelera").load(), 640, 490);
        stage.setScene(scene);
        stage.setTitle("Supercines");
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {//Hace el cambio de grafo de escena
        scene.setRoot(loadFXML(fxml).load());//aca cargamos o convertimos en el grafo
    }

    public static void setScene(Scene sc) throws IOException {//Hace el cambio de grafo de escena
        st.setScene(sc);//aca cargamos o convertimos en el grafo
    }

    public static FXMLLoader loadFXML(String fxml) throws IOException {//Cambiamos a FXMLoader 
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader;
    }

    public static void main(String[] args) {
//        ArrayList<Pelicula> pelis=Pelicula.leerPeliculas("peliculas.ser");
//        System.out.println(pelis);
        launch();
        //Cuando usamos el star estamos creanso de forma paralela
        //Entonces habra el main thread y los 2 hilos
//        try{
//        Thread.sleep(5000);}//manda a dormir el uso que este ahi en este caso es el principal
//        //Manda a dormir el thread de la clase
//        catch(InterruptedException ex){
//            ex.getMessage();
//        }
//        
//        Hilo h1 = new Hilo("Thread 1");
//        //h1.run();//Estoy llamando en el mismo main thread no en paralelo 
//
//        //Crear un contexto paralelo llamo al start
//        //Compiten entre los Hilos no hay orden
//        
//        //h1.run();//actua el thread del la clase aunque se este ejecutando con el hilo principal
//        Hilo h2 = new Hilo("Thread 2");
//       
//        
//        Hilo h3= new Hilo("Threas 3");
////        h1.run();//Primero ejecutate esto en el hilo principal luego crea los parelelos
////         h2.start();
////        h3.start();

//            h2.start();
//            h3.start();//Aqui si van a competir todos porque primero crea
//            h1.run();
//            
//            //Con runnable
//            Hilo2 h22=new Hilo2();//Capacidad de ser runnable
//            Thread t1= new Thread(h22);
//            t1.start();
    }

}
