/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.ejerciciodesarrollo;

/**
 *
 * @author CltControl
 */
public class Lugar {
    private String nombre;
    private String pista;
    private int tiempo;
    private TipoLugar tipo;//null porque es clase
    private boolean estaLadron;//False

    public Lugar(String nombre, String pista, int tiempo, TipoLugar tipo, boolean estaLadron) {
        this.nombre = nombre;
        this.pista = pista;
        this.tiempo = tiempo;
        this.tipo = tipo;
        this.estaLadron = estaLadron;
    }  

    public Lugar(String nombre, String pista, int tiempo, TipoLugar tipo) {
        
        this(nombre,pista,tiempo,tipo,false);
    }
    
    @Override
    public String toString(){
        return this.nombre+" "+tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public TipoLugar getTipo() {
        return tipo;
    }

    public void setTipo(TipoLugar tipo) {
        this.tipo = tipo;
    }

    public boolean isEstaLadron() {
        return estaLadron;
    }

    public void setEstaLadron(boolean estaLadron) {
        this.estaLadron = estaLadron;
    } 
}
