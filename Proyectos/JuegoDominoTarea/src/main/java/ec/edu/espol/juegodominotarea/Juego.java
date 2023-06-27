/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.juegodominotarea;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonanyu 11.1
 */
public class Juego {

    private ArrayList<Ficha> lineaJuego;
    private ArrayList<Jugador> jugadores;

    public Juego() {
        this.lineaJuego = new ArrayList<>();
        this.jugadores = new ArrayList<>();
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

    public void agregarJugador(String nombre) {
        Jugador ju1 = new Jugador(nombre, Utilitaria.crearManoJugador());
        this.jugadores.add(ju1);
    }

    public int obtenerValorInicioLinea() {
        return this.lineaJuego.get(0).getLado1();
    }

    public int obtenerValorFinalLinea() {
        return this.lineaJuego.get(this.lineaJuego.size() - 1).getLado2();
    }

    public void mostrarLinea() {
        for (int i = 0; i < this.lineaJuego.size(); i++) {
            if (i != this.lineaJuego.size() - 1) {
                System.out.print(this.lineaJuego.get(i) + "-");
            } else {
                System.out.println(this.lineaJuego.get(i));
            }
        }
    }

    public boolean agregarFichaLinea(Ficha f, Jugador j) {
        Scanner input = new Scanner(System.in);
        if ((f instanceof FichaComodin)) {
            if (this.lineaJuego.size() != 0) {
                System.out.print("Ingrese la posicion donde lo quiere agregar");
                String pos = input.nextLine();
                if (pos.equals("Inicio")) {
                    FichaComodin otrFicha = (FichaComodin) f;
                    System.out.print("Ingrese el valor del lado 1");
                    int lado1=input.nextInt();
                    otrFicha.setLado1(lado1);
                    this.lineaJuego.add(0, otrFicha);
                } else if (pos.equals("Fin")) {
                    FichaComodin otrFicha = (FichaComodin) f;
                    System.out.print("Ingrese el valor del lado 2");
                    int lado2=input.nextInt();
                    otrFicha.setLado2(lado2);
                    this.lineaJuego.add(otrFicha);
                }
            }else{
                FichaComodin otrFicha = (FichaComodin) f;
                System.out.print("Ingrese el valor del lado 1");
                    int lado1=input.nextInt();
                    otrFicha.setLado1(lado1);
                System.out.print("Ingrese el valor del lado 2");
                    int lado2=input.nextInt();       
                    otrFicha.setLado2(lado2);
                    this.lineaJuego.add(otrFicha);
            }
        }
        if (!(f  instanceof FichaComodin)) {
            if(this.lineaJuego.size() == 0){
                this.lineaJuego.add(f);
            }
        }
    }
}
