module ec.edu.espol.examenmundial {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.examenmundial to javafx.fxml;
    exports ec.edu.espol.examenmundial;
}
