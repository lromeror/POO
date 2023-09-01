module ec.edu.espol.conversionmoneda {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.conversionmoneda to javafx.fxml;
    exports ec.edu.espol.conversionmoneda;
}
