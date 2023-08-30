/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.calc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author CltControl
 */
public class CalculadoraController implements Initializable {

    @FXML
    private TextField f1num;
    @FXML
    private TextField f2num;
    @FXML
    private TextField f1dem;
    @FXML
    private TextField f2dem;
    @FXML
    private Label res;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML//Aqui solo esta inicializado en memoria
    private void sumar(MouseEvent event) {
        //Alert a =new Alert(Alert.AlertType.ERROR,"Prueba");//Eventos en controler estan el code son eventos para que reaccionen
        //a.show();//Me dice que muestre al mensaje se va a llamar al primry.xm necesario cambiar
        try{
        int f1nu= Integer.parseInt(f1num.getText());
        int f2nu= Integer.parseInt(f2num.getText());
        int f1de= Integer.parseInt(f1dem.getText());
        int f2de= Integer.parseInt(f2dem.getText());
        
        Fraccion f1=new Fraccion(f1nu,f1de);
        Fraccion f2=new Fraccion(f2nu,f2de);
        Fraccion result =f1.sumar(f2);
        Alert a =new Alert(Alert.AlertType.INFORMATION,result.toString());
        a.show();
        limpiarInfo();
             res.setText(result.toString());//id del text field
        }catch(NumberFormatException e){
            Alert a =new Alert(Alert.AlertType.ERROR,"Caracteres Invalidos");
            a.show();
        }catch (DenominadorException e){
            Alert a =new Alert(Alert.AlertType.ERROR,e.getMessage());
            a.show();
        }
        
    }
    
    //Vamos a extrar la informacion que el usuario ingrese
    @FXML
    private void limpiar(MouseEvent event) {
        limpiarInfo();//MOdularizacion
    }
    
    private void limpiarInfo(){
        f1num.setText("");
        f2num.setText("");
        f1dem.setText("");
        f2dem.setText("");
        res.setText("");
    }
    
}
