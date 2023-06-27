/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.rastreovehiculolr;

/**
 *
 * @author Jonanyu 11.1
 */
public class Alarma {
    
    //Atributos Intrinsecos
    private String regisVeh;
    private String horaInicio;
    private String horaFin;
    
    //Atributos Relacionales
    private Vehiculo vehiculo;
    private String DiaSeman;

    
    //Consultadores y Modificadores
    public String getRegisVeh() {
        return regisVeh;
    }

   
    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getDiaSeman() {
        return DiaSeman;
    }

    public void setDiaSeman(String DiaSeman) {
        this.DiaSeman = DiaSeman;
    }
    
    
    
}
