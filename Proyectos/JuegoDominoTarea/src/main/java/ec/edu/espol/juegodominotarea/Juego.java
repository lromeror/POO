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
public class Juego {
    private ArrayList<Ficha> lineaJuego;
    private ArrayList<Jugador> jugadores;

    public Juego() {
        this.lineaJuego=new ArrayList<>();
        this.jugadores=new ArrayList<>();
    }

    public ArrayList<Ficha> getLineaJuego() {
        return lineaJuego;
    }

    public void setLineaJuego(ArrayList<Ficha> lineaJuego) {
        this.lineaJuego = lineaJuego;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void agregarJugador(String nombre){
        Jugador ju1=new Jugador(nombre,Utilitaria.crearManoJugador());
        this.jugadores.add(ju1);
    }
    
    public int obtenerValorInicioLinea(){
        return this.lineaJuego.get(0).getLado1();
    }
    
    public int obtenerValorFinalLinea(){
        return this.lineaJuego.get(this.lineaJuego.size()-1).getLado2();
    }
    
    public void mostrarLinea(){
        for (int i = 0; i < this.lineaJuego.size(); i++) {
            if (i!=this.lineaJuego.size()-1) {
                System.out.print(this.lineaJuego.get(i)+"-");
            }else
            System.out.println(this.lineaJuego.get(i));
        }
    }
    
    public boolean agregarFichaLinea(Ficha f, Jugador j){
        
    }
}
