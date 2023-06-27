/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.rastreovehiculolr;

import java.util.ArrayList;

/**
 *
 * @author Jonanyu 11.1
 */
public class Gps {
    //Atributo Identificador
    private String idPlaca;
    
    //Atributos instrinseco
    private String marca;
    
    private String modelo;
    private ArrayList<Ubicacion> ubicaciones;
    
    //Atributo Relacional
    private Vehiculo vehiculo;

    public Gps( String marca, String modelo, Vehiculo vehiculo) {
        this.marca = marca;
      
        this.modelo = modelo;
        this.vehiculo = vehiculo;
        
    }

    public String getIdPlaca() {
        return idPlaca;
    }

    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }

    
    
}
