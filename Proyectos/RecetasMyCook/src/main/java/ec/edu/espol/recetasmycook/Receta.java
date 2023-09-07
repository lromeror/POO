/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.recetasmycook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gladys
 */
public class Receta {

    private String titulo;
    private String ingredientes;
    private int duracion;
    private ArrayList<Paso> pasos;

    public Receta(String titulo, String ingredientes, int duracion, ArrayList<Paso> pasos) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public ArrayList<Paso> getPasos() {
        return pasos;
    }

    public int getDuracion() {
        return duracion;
    }//|

    public static ArrayList<Receta> leerReceta() {
        ArrayList<Receta> recetas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("recetas.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineRe = line.split(",");
                String[] pasos = lineRe[3].split(";");
                ArrayList<Paso> pasoslis = new ArrayList<>();
                for (String paso : pasos) {
                    String[] tokenPa = paso.split("-");
                    Paso pa = new Paso(tokenPa[0], tokenPa[1], Integer.parseInt(tokenPa[2]));
                    pasoslis.add(pa);
                }

                Receta re = new Receta(lineRe[0], lineRe[1], Integer.parseInt(lineRe[2]), pasoslis);
                recetas.add(re);
            }

        } catch (IOException e) {
            e.getMessage();
        }
        return recetas;
    }

}
