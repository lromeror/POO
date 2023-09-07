module ec.edu.espol.recetasmycook {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ec.edu.espol.recetasmycook to javafx.fxml;
    exports ec.edu.espol.recetasmycook;
}
