/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.juegodominotarea;

import java.util.ArrayList;

/**
 *
 * @author Jonanyu 11.1
 */
public class Jugador {
    private String nombre;
    private ArrayList<Ficha> mano;

    public Jugador(String nombre, ArrayList<Ficha> mano) {
        this.nombre = nombre;
        this.mano = mano;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Ficha> getManos() {
        return mano;
    }

    public Ficha getFicha(int indice){
       int rangoLista=this.mano.size()-1;
        if ((indice>rangoLista) || (indice<0)) {
            return null;
        }
        return  this.mano.get(indice);
    }
    
    public void removerFicha(Ficha F){
        this.mano.remove(F);
    }   
    
    public void imprimirMano(){
        
        for (int i = 0; i < this.mano.size(); i++) {
            if (i!=this.mano.size()-1) {
                System.out.print(this.mano.get(i)+"-");
            }else
            System.out.println(this.mano.get(i));
        }
    }
}
