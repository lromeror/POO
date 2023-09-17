/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.examenmundial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gladys
 */
public class Equipo {

    private String pais;
    private ArrayList<Jugador> jugadores;

    public Equipo(String pa, ArrayList<Jugador> jugadores) {
        this.pais = pa;
        this.jugadores = jugadores;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return this.pais;
    }

    public static ArrayList<Equipo> obtenerEquipos() {
        ArrayList<Equipo> equipos = new ArrayList<>();
        try (BufferedReader input = new BufferedReader(new FileReader("src/main/resources/files/equipos.txt"))) {
            String linea;
            while ((linea = input.readLine()) != null) {
                String[] info = linea.split("\\|");
                String pais = info[0];
                String jugado = info[1];

                String infoJuga[] = jugado.split(";");
                ArrayList<Jugador> juga = new ArrayList<>();
                for (String j : infoJuga) {
                    String token[] = j.split(",");
                    Jugador ju = new Jugador(token[0], token[1], Double.parseDouble(token[2]), token[3]);
                    juga.add(ju);
                }
                Equipo eq = new Equipo(pais, juga);
                equipos.add(eq);
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return equipos;
    }

    public double calcularTotalSueldos() {
        double totaEquipo = 0;
        for (Jugador juga : this.jugadores) {
            totaEquipo = totaEquipo + juga.getSalario();
        }
        return totaEquipo;
    }
}
