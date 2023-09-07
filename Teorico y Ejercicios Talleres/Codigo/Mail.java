/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Mail {
    private String origen;
    private String destino;
    private String titulo;
    private String mensaje;

    public Mail(String origen, String destino, String titulo, String mensaje) {
        this.origen = origen;
        this.destino = destino;
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Mail other = (Mail) obj;
        return Objects.equals(this.origen, other.origen) && Objects.equals(this.destino, other.destino) && Objects.equals(this.titulo, other.titulo) && Objects.equals(this.mensaje, other.mensaje);
    }
    
    @Override
    public String toString()
    {
        return "<from: "+this.origen+ ",to: "+this.destino+", tittle: "+this.titulo+", message: "+this.mensaje+">";
    }
    
    public static Mail nextMail(Scanner sc)
    {
        System.out.println("Ingrese el correo origen>");
        String origen = sc.nextLine();
        System.out.println("Ingrese el correo destino>");
        String destino = sc.nextLine();
        System.out.println("Ingrese el titulo>");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el mensaje>");
        String mensaje = sc.nextLine();
        return new Mail(origen,destino,titulo,mensaje);
    }
}
