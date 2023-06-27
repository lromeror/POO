/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.ejerciciodesarrollo;

/**
 *
 * @author CltControl
 */
public class EjercicioDesarrollo {
//Enumeracion es una clase especial donde vamos a definir atributos
//Accedemos a numeracion con el nombre de Ecnumeracion.Variable
    //TipoLugar t =TipoLugar.Museo
    //No necesita el new
    
    public static void main(String[] args) {
        //Enumeraciones NO USAR NEW
        TipoLugar t=TipoLugar.RESTAURANTE;//Estamos dando valor
        t=TipoLugar.HOTEL;//No son valores numericos
        
        System.out.println(t);//Funciona como una cadena de caracteres
        //String h=t.toString();
      /*
        if (t.toString().equals(TipoLugar.HOTEL)) {//No se puede comparar con un string
            System.out.println("TRUE");
        }*/
    }
    
}
