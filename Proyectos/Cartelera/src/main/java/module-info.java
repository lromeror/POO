module ec.edu.espol.cartelera {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.cartelera to javafx.fxml;
    exports ec.edu.espol.cartelera;
    
    //Tenemos que hacer visible los paquetes
    
    opens ec.edu.espol.controllers to javafx.fxml;
    exports ec.edu.espol.controllers;
    
    opens ec.edu.espol.model to javafx.fxml;
    exports ec.edu.espol.model;
}
