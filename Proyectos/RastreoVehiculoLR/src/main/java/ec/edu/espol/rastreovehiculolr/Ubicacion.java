/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.rastreovehiculolr;

/**
 *
 * @author Jonanyu 11.1
 */
public class Ubicacion {
    //Atributo Identificador
    private String idPlaca;
    
    //Atributos Intrinsecos
    private double latitud;
    private double longitud;
    private int min;
    
    //Atributo Relacional
    private Gps gps;

    public Ubicacion (String idPlaca) {
        this.idPlaca = idPlaca;
        this.latitud = 0;
        this.longitud = 0;
        this.min = 0;
    }

    public Ubicacion(String idPlaca, double latitud, double longitud, int min) {
        this.idPlaca = idPlaca;
        this.latitud = latitud;
        this.longitud = longitud;
        this.min = min;
    }
    

    public String getIdPlaca() {
        return idPlaca;
    }
    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public Gps getGps() {
        return gps;
    }

    public void setGps(Gps gps) {
        this.gps = gps;
    }
}
