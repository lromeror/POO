/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.ejerciciodesarrollo;

/**
 *
 * @author CltControl
 */
public class Investigador {
    private double tiempoGastado;
    //Tiene constructor default

    public double getTiempoGastado() {
        return tiempoGastado;
    }

    public void setTiempoGastado(float tiempoGastado) {
        this.tiempoGastado = tiempoGastado;
    }
    
    public boolean visitar(Lugar L){
        System.out.println(L.getPista());
        this.tiempoGastado+=L.getTiempo();
        
        if (L instanceof Hotel) {
            Hotel h=(Hotel)L;
            if (h.getNumPisos()>3) {
                int diff=h.getNumPisos()-3;
                //double tiempo=(double)(diff*12)/60;//La division en java es dependiendo el tipo de dato
                double tiempo=(diff*12)/60.0;
                this.tiempoGastado+=tiempo;
            }
        }
        
        return L.isEstaLadron();//Se ponene como is
    }
    
}
