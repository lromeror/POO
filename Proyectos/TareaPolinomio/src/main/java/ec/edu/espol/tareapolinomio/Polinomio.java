/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tareapolinomio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Luis Romero
 */
public class Polinomio implements Serializable {
    private int grado;
    private int coeficientes[];
    private static final long serialVersionUID = 274965647874716638L;

    public Polinomio(int grado) {
        this.grado = grado;
        this.coeficientes = new int[grado + 1];
    }

    public Polinomio(int[] coeficientes) {
        this.coeficientes = coeficientes;
        this.grado = coeficientes.length - 1;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int[] getCoeficientes() {
        return coeficientes;
    }

    public void setCoeficientes(int[] coeficientes) {
        this.coeficientes = coeficientes;
    }

    public void saveFile(String nameFile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile, true))) {
            bw.write(this.toString());
            bw.newLine();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(this.grado);
        str.append("|");
        for (int i = 0; i < this.coeficientes.length; i++) {
            if (i != this.coeficientes.length-1) {
                str.append(this.coeficientes[i]);
                str.append(",");
            } else {
                str.append(this.coeficientes[i]);
            }
        }
        return str.toString();
    }

    public static void saveListToFile(String nameFile, ArrayList<Polinomio> polinomios) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))) {
            for (Polinomio po : polinomios) {
                bw.write(po.toString());
                bw.newLine();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static ArrayList<Polinomio> readListFromFIle(String nameFile) {
        ArrayList<Polinomio> polinomios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] linePoli = line.split("\\|");
                try{

                int grado = Integer.parseInt(linePoli[0]);
                
                String[] coef = (linePoli[1]).split("\\,");
                Polinomio p = new Polinomio(grado);
                for (int i = 0; i < p.coeficientes.length; i++) {
                    p.coeficientes[i] = Integer.parseInt(coef[i]);
                    
                }
                polinomios.add(p);
                }catch(NumberFormatException e){
                    System.out.println("No se pudo agregar esta linea");
                }
                
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return polinomios;
    }

    public static void saveListToFileSer(String nameFile, ArrayList<Polinomio> polinomios) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nameFile))) {
            out.writeObject(polinomios);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static ArrayList<Polinomio> readListFromFileSer(String nameFile) {
        ArrayList<Polinomio> polinomios = new ArrayList<>();
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(nameFile))) {
            polinomios = (ArrayList<Polinomio>) input.readObject();
        } catch (Exception e) {
            e.getMessage();
        }
        return polinomios;
    }
}