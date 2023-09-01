/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.conversionmoneda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rocio
 */
public class TasaConversion implements Serializable {

    private static final long SerialVersionUID = 10l;
    private Moneda monedaOrigen;
    private Moneda monedaDestino;
    private double tasa;

    public TasaConversion(Moneda monedaOrigen, Moneda monedaDestino, double tasa) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.tasa = tasa;
    }

    public Moneda getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(Moneda monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public Moneda getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(Moneda monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    /**
     * Leer el archivo de tasas.dat que contiene un objeto ArrayList<Tasa>
     * y devolverlo
     */
    public static ArrayList<TasaConversion> obtenerTasas() {
        ArrayList<TasaConversion> readConve = new ArrayList<>();
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("tasas.dat"))) {
            readConve = (ArrayList<TasaConversion>) input.readObject();
        } catch (Exception e) {
            e.getMessage();
        }

        return readConve;
    }

}
