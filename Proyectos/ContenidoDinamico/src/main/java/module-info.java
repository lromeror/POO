module ec.edu.espol.contenidodinamico {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.contenidodinamico to javafx.fxml;
    exports ec.edu.espol.contenidodinamico;
}
