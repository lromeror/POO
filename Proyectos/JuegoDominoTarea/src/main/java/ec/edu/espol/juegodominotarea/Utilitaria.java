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
public class Utilitaria {
    public static ArrayList<Ficha> crearManoJugador(){
        ArrayList<Ficha> fichas=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int numAle =(int)(Math.random()*6+1);
            Ficha f=new Ficha(numAle,numAle);
            fichas.add(f);
        }
        Ficha comod=new FichaComodin();
        fichas.add(comod);
        return fichas;
    }
}
