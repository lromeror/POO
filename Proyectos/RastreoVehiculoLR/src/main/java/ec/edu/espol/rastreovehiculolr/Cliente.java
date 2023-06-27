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
public class Cliente {
    //Atributo Indicador
    private String cedula;

    //Atributos Intrinsecos
    private String nombre;
    private String direccion;

    //Atributo relacional
    ArrayList<Vehiculo> vehiculos;

    //Constructor 
    public Cliente(String cedula, String nombre, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        //this.vehiculos=new ArrayList<>();
    }

    //Modificadores y consultadores de atributos
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
