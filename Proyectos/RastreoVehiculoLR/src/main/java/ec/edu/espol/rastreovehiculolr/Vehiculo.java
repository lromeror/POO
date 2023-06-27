/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.rastreovehiculolr;

import java.util.ArrayList;

/**
 *
 * @author Jonanyu 11.1
 */
public class Vehiculo {
    //Identificador
    private String numPlaca;
    private String id_cedula;
    
    //Atributos Intrinsecos
    private int ano;
    private float km;
    
    //Atributos Relacionales
    private Cliente cliente;
    private ArrayList<Sensores> sensores ;
    private ArrayList<Gps> gps;
    private ArrayList<Alarma> alarma;
    
    //Constructor

    public Vehiculo(String numPlaca, int ano, float km, Cliente cliente, ArrayList<Sensores> sensores, ArrayList<Gps> gps, ArrayList<Alarma> alarma) {
        this.numPlaca = numPlaca;
        this.ano = ano;
        this.km = km;
        this.cliente = cliente;
        this.sensores = sensores;
        this.gps = gps;
        this.alarma = alarma;
    }
    
    
    //Modificadores y consultadores de atributos
    public String getNumPlaca() {
        return numPlaca;
    }
    
    public int getAno() {
        return ano;
    }
    
    
    
    
    public float getKm() {
        return km;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Sensores> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Sensores> sensores) {
        this.sensores = sensores;
    }

    public ArrayList<Gps> getGps() {
        return gps;
    }

    public void setGps(ArrayList<Gps> gps) {
        this.gps = gps;
    }

    public ArrayList<Alarma> getAlarma() {
        return alarma;
    }

    public void setAlarma(ArrayList<Alarma> alarma) {
        this.alarma = alarma;
    }
}
