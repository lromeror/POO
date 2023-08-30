package ec.edu.espol.contenidodinamico;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * JavaFX App
 */
public class App extends Application {//Hereda de la clase aplication

    private static Scene scene;

    @Override//Sobreescribe el metodo start
    public void start(Stage stage) throws IOException {//Donde inicia la aplicacion
        //JavaFX ya nos da un scenario ese es el escenario es que el que recibe start por parametro
        //No debemos de preocuparnos de darle memoria 
//        scene = new Scene(loadFXML("Login"), 640, 480);
//        stage.setScene(scene);
//        stage.show();
          stage.setTitle("Ventana Test");
          
          VBox vb=new VBox();//Es un panel. PERO LO DEFINO COMO EL RAIZ
          //TODOS SON NODOS, pero por ahora LI ojo Algebra, todavia no hay grafo de ESCENA
          //Generalmente el padre es un CONTENEDOR
          //Pero podemos definirlo, por ahora VBOX
          //Todos lo contenedores tienen .GETChildren DEVUELVE una lista
          //GETCHILDREN me da los hijos que tiene el Panel
          //ES como una Lista de NODOS, me devuelve el OBSERVABLELIST
          //Podemos ver como un nodo asi que podemos poner add OJO recibe un NODO    
          TextField tf=new TextField ();//VBOX es la raiz
          Button b=new Button("BUTTON");
          Button b2=new Button("BUTTON 2");
          vb.getChildren().add(tf);
          vb.getChildren().add(b);
          //Tambien podemos agregar Un VBOx dentro de Otro VBOX
          //VBox v2=(VBox)vb.getChildren().get(1);//Hacemos DOwncasting porque es de tipo NOdo el elemento
          //Entonce aqui dentro del VBox estamos diciendo que en la pos 1 me de otro VBOx
          //Ya de Ahi podemos hacer las operaciones que queramos
          //Para agregar una lista a obsevable seria add_ALL
           vb.setSpacing(10);//Se paracion de los CHIldren
          //Se debe crear una ESCENA porque obviamente los actores necesitan una Escena
          //para presentarse asi que creamos un objeto Scena
          //Button b1=new Button("BUTTON2Padre");
          
          //Ejemplo
            HBox hb=new HBox();
            hb.setSpacing(10);
            hb.getChildren().add(b);
            hb.getChildren().add(b2);
            vb.getChildren().add(hb);
          
            //Ejemplo
            /*
              VBox v=new VBox();
              TextField t1=new TextField();
              TextField t2=new TextField();  
              v.getChildren().addAll(t1,t2);//FOrma de enviiar diversas cosas al contenedor
            */
            
            
          Scene sc= new Scene(vb,200,100);//Constructor recibe la Raiz Paneles o COntroles
          //Pero ojo como podemos mantener la scena y cambar el grafo deEscena 
          //Osea setemos con setRoot nuestro nueva Raiz 
          //sc.setRoot(b1);//CAmbia al papa
          //POr ende ahora como ya tenemos la Scena y los actores necesitan un Scenario
          stage.setScene(sc);//
          stage.setResizable(false);//NO permite que se maximize
          //Antes del Stage show Crear el grafo de Scena
          stage.show();
          
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {//Carga FXML
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        //Extrae todos los controles y los construye los objetos
        return fxmlLoader.load();//Este nos devuelve el papa 
    }

    public static void main(String[] args) {
        launch();
    }

}