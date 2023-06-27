/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.classes;
import java.util.ArrayList;
/**
 *
 * @author Jonanyu 11.1
 */

public class Dueno {
   
    int id;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String email;
    ArrayList<Mascota> mascota;
    //Sobreviva el constructor default
    public Dueno(){
    }
    
    public Dueno(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellido=apellidos;//Representa a la instancia que esta creando
        this.mascota=new ArrayList <>();//Lista vacia

    }
    
    public Dueno(String nombre,String apellidos, String direccion){
    }
     
}
