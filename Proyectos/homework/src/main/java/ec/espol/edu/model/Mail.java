/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espol.edu.model;

import java.util.Scanner;

/**
 *
 * @author Luis Romero
 */
public class Mail {
    //Atributos
    private String origen;
    private String destino;
    private String titulo;
    private String mensaje;
   
   //Constructor
    public Mail(String origen, String destino, String titulo, String mensaje) {
    this.origen = origen;
    this.destino = destino;
    this.titulo = titulo;
    this.mensaje = mensaje;
    }
    
    //Modificadores de Acceso
    public String getOrigen(){
        return this.origen;
    }
    public String getDestino(){
        return this.destino;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getMensaje(){
        return this.mensaje;
    }
    public void setOrigen(String origen){
        this.origen = origen;   
    }
    public void setDestino(String destino){
        this.origen = destino;
    }
    public void setTitulo(String titulo ){
        this.titulo= titulo;
    }
    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }
    
    //SObre Escritura
    @Override
    public String toString() {
        return "<from:"+this.origen+",to:"+this.destino+",tittle:"+this.titulo+",message:"+this.mensaje+">";
    }
    
    //Sobreescritura del Equals
    @Override
    public boolean equals(Object ob) {
        if (ob==null)
            return false;
        if (this==ob)
            return true;
        if (this.getClass()!=ob.getClass())
            return false;
        Mail obj= (Mail)ob;
        return (this.origen == obj.origen) && (this.destino==obj.destino) && (this.titulo==obj.titulo) && (this.mensaje==obj.mensaje);
    }
    
    //Correos o Mails
     public static Mail nextMail() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el correo origen: ");
        String origen = entrada.next();
        System.out.print("Ingrese el correo destino: ");
        String destino = entrada.next();
        System.out.print("Ingrese el título del correo: ");
        String titulo = entrada.next();
        System.out.print("Ingrese el mensaje del correo: ");
        String mensaje = entrada.next();
        return new Mail(origen, destino, titulo, mensaje);
    
}
     public static Mail askMail(){
            
        Scanner entrada = new Scanner(System.in);
        System.out.print("Añada un Mail");
        System.out.print("Ingrese el correo de origen: ");
        String origen = entrada.next();
        System.out.print("Ingrese el correo de destino: ");
        String destino = entrada.next();
        System.out.print("Ingrese el correo de titulo: ");
        String titulo = entrada.next();
        System.out.print("Ingrese el correo de mensaje: ");
        String mensaje = entrada.next();
        
        return new Mail(origen,destino,titulo,mensaje);
        }
}
