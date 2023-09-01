/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.conversionmoneda;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author rocio
 */
public class Moneda implements Comparable<Moneda>, Serializable{
    private static final long SerialVersionUID = 10l;
    private String moneda;
    private String imagen;

    public Moneda(String moneda, String imagen) {
        this.moneda = moneda;
        this.imagen = imagen;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String Moneda) {
        this.moneda = Moneda;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public String toString(){
        return moneda;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        final Moneda other = (Moneda) obj;
        if (!Objects.equals(this.moneda, other.moneda)) {
            return false;
        }
        return true;
    }
    
    
    public static List<Moneda> obtenerMonedas(){
        List<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda("dollar","dollar.png"));
        monedas.add(new Moneda("euro","euro.jpeg"));
        monedas.add(new Moneda("pesos colombianos","pesosc.png"));
        return monedas;
    }

    @Override
    public int compareTo(Moneda mo) {
        return this.moneda.compareTo(mo.moneda);
    }
    
    
}
