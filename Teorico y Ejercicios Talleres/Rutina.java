/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.model;

import java.util.ArrayList;

public class Rutina {
    private String nombre;
    private ArrayList<Ejercicio> ejercicios;
    
    public Rutina(String nombre, ArrayList<Ejercicio> ejercicios){
        this.nombre = nombre;
        this.ejercicios = ejercicios;
    }
    
    public static ArrayList<Rutina> cargarListaRutinas(String nombreArchivo){
        
    }
}
