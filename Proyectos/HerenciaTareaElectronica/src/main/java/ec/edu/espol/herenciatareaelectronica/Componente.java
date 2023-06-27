/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.herenciatareaelectronica;

/**
 *
 * @author Luis Romero
 */
public class Componente {

    private double costo;
    private String nombre;
 
    //Constructor
    public Componente(double costo, String nombre) {
        this.costo = costo;
        this.nombre = nombre;
    }

    public Componente(String nombre) {
        this.nombre = nombre;
        this.costo = 10;
    }

    public double getCosto() {
        return this.costo;
    }

    public String getNombre() {
        return this.nombre;
    }

}
