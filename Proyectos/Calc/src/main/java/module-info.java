module ec.edu.espol.calc {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.calc to javafx.fxml;
    exports ec.edu.espol.calc;
}
