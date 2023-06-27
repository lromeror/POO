/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.ejerciciodesarrollo;

/**
 *
 * @author CltControl
 */
public class Hotel extends Lugar{
    private int numPisos;

    public Hotel(int numPisos, String nombre, String pista, int tiempo, TipoLugar tipo, boolean estaLadron) {
        super(nombre, pista, tiempo, tipo, estaLadron);
        this.numPisos = numPisos;
    }

    public Hotel(int numPisos, String nombre, String pista, int tiempo, TipoLugar tipo) {
        super(nombre, pista, tiempo, tipo);
        this.numPisos = numPisos;
    }
    
    @Override
    public String toString(){
        return super.toString()+" Pisos:"+ this.numPisos;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    
    
}
