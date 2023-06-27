/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.practicahom3;

/**
 *
 * @author Jonanyu 11.1
 */
public class Mail {
    String correoOrigen;
    String correoDestino;
    String titulo;
    String mensaje;
    
    //Constructor
    public Mail(String correoOrigen, String correoDestino,String titulo,String mensaje){
        this.correoOrigen=correoOrigen;
        this.correoDestino=correoDestino;
        this.titulo=titulo;
        this.mensaje=mensaje;
    }
    
    //Consultadores
    public String getCorreoOrigen(){
        return this.correoOrigen;
    }
    
    public void setCorreoOrigen(String correoOrigen){
        this.correoOrigen=correoOrigen;
    }
    
    public String getCorreoDestino(){
        return this.correoDestino;    
    }
    
    public void setCorreoDestino(String correoDestino){
        this.correoOrigen=correoDestino;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTituli(String titulo){
        this.titulo=titulo;
    }
    
    public String getMensaje(){
        return this.mensaje;
    }
    
    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }
    
    @Override
    public String toString(){
        return "<from: "+this.correoOrigen+", to: "+this.correoDestino+", tittle: "+this.titulo+", message: "+this.mensaje+">";
    }
    
    public boolean equals(Object ob){
        if(ob==null){//null check
            return false;
        }
        
        if (this==) {
            
        }
    }
    
}
