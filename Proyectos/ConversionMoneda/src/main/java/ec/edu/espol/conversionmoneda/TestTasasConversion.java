/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.conversionmoneda;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rocio
 */
public class TestTasasConversion implements Serializable {
    /**
     * corra este metodo para generar el archivo de TasasConserion una vez 
     * que ya haya implementado los cambios solicitados
     * @param args 
     */
    public static void main(String[] args){
        List<Moneda> monedas = Moneda.obtenerMonedas();
        List<TasaConversion> tasas = new ArrayList<>();
        tasas.add(new TasaConversion(monedas.get(0),monedas.get(1),0.9));
        tasas.add(new TasaConversion(monedas.get(1),monedas.get(0),1.11));
        tasas.add(new TasaConversion(monedas.get(0),monedas.get(2),5.9));
        tasas.add(new TasaConversion(monedas.get(2),monedas.get(0),0.16));
        try(ObjectOutputStream ob = 
                new ObjectOutputStream(new FileOutputStream("tasas.dat")) ){
            ob.writeObject(tasas);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
