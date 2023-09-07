/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.recetasmycook;

/**
 *
 * @author Gladys
 */
public class Paso {
    private String imagen;
    private String descripcion;
    private int tiempo;//en segundos

    public Paso(String imagen, String descripcion, int tiempo) {
         this.imagen = imagen;
        this.descripcion = descripcion;
        this.tiempo = tiempo;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public String getImagen() {
        return imagen;
    }
   
    
}
