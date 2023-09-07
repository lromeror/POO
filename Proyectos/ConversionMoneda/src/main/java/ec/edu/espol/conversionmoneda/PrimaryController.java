package ec.edu.espol.conversionmoneda;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController implements Initializable {

    @FXML
    private TextField text;
    @FXML
    private ComboBox<String> cobx1;
    @FXML
    private ComboBox<String> cobx2;

    private ArrayList<Moneda> monedas;
    private String destinoMo;
    private String origenMo;
    @FXML
    private ImageView imageC;
    @FXML
    private Label answer;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        monedas = (ArrayList<Moneda>) Moneda.obtenerMonedas();

        for (Moneda mo : monedas) {
            cobx1.getItems().add(mo.getMoneda());
            cobx2.getItems().add(mo.getMoneda());
        }
    }

    @FXML
    private void convertir() {
        ArrayList<TasaConversion> tasas = TasaConversion.obtenerTasas();
        try{
        if (!origenMo.equals(destinoMo)) {
            for (TasaConversion tas : tasas) {
                if ((tas.getMonedaDestino().getMoneda().equals(destinoMo)) && (tas.getMonedaOrigen().getMoneda().equals(origenMo))) {
                    try {
                        double conver = Double.parseDouble(text.getText()) * tas.getTasa();
                        String res = Double.toString(conver);
                        this.answer.setText(res);
                        Image im = new Image("imgs/" + tas.getMonedaDestino().getImagen());
                        imageC.setImage(im);
                        return;
                    } catch (NumberFormatException e) {
                        e.getMessage();
                        Alert a = new Alert(Alert.AlertType.INFORMATION, "Ingrese un valor valido");
                        text.setText("");
                        a.show();
                    }
                }
            }
        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Elija una moneda diferente");
            a.show();
        }
        }catch (Exception e){
        Alert a = new Alert(Alert.AlertType.INFORMATION, "Texto vacios");
            a.show();
        }
    }

    @FXML
    private void origen(ActionEvent event) {
        ComboBox combo1 = (ComboBox) event.getSource();
        String origen = (String) combo1.getValue();
        origenMo = origen;

    }

    @FXML
    private void destino(ActionEvent event) {
        ComboBox combo1 = (ComboBox) event.getSource();
        String destino = (String) combo1.getValue();
        destinoMo = destino;
    }
}
