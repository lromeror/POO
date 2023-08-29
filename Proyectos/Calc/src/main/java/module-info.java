module ec.edu.espol.calc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.calc to javafx.fxml;
    exports ec.edu.espol.calc;
}
