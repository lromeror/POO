/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espol.ejerciciodesarrollo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonanyu 11.1
 */
public class EjercicioDesarrollo {

    /**
     * @param args the command line arguments
     */
    public final static int TIEMPOJUEGO = 60;//atributo estatico 
    private String desCrimen="hola";
    private Investigador investigador;
    private ArrayList<Lugar> lugares;

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("pepe");
    }

    public EjercicioDesarrollo() {
    }

    public void cargarLugares() {
        String[] nombresLugares = {"Museo del Louvre", "Paris j'Adore", "Plaza de Espana", "Pituca Madrid"};
        String[] pistas = {"Te has equivocado", "Vuélvelo a intentar", "Ha sido descubierto", "Quizás si intentas otra vez"};
        int[] tiempos = {4, 3, 5, 5};
        TipoLugar[] tipolugares = {TipoLugar.MUSEO, TipoLugar.HOTEL, TipoLugar.PARQUE, TipoLugar.RESTAURANTE};
        boolean[] estadosLadrones = {false, false, true, false};

        for (int i = 0; i < nombresLugares.length; i++) {
            Lugar l = new Lugar(nombresLugares[i], pistas[i], tiempos[i], tipolugares[i], estadosLadrones[i]);
            this.lugares.add(l);
        }
    }
    

    public void buscarLadron() {
        Scanner input=new Scanner(System.in);
        double tiempoRestante =0;
        boolean estado=false;
        
        do {
            for (Lugar l:this.lugares) {
                System.out.println(l);
            }
            System.out.print("Ingrese numero del lugar donde crees se encuentra el ladron: ");
            int posLugar=input.nextInt();
            estado=investigador.visitar(this.lugares.get(posLugar));
            if (estado==false) {
                System.out.println("Tiempo gastado "+investigador.getTiempoGastado());
                System.out.println("Tiempo restante"+(EjercicioDesarrollo.TIEMPOJUEGO-investigador.getTiempoGastado()));
            }
            estado=true;
        } while ((estado == false)&&(tiempoRestante>0));
        System.out.println("Lo enconstraste");
        System.out.println(desCrimen);

    }
}
