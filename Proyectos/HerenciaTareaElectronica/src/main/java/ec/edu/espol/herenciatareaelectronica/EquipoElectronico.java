/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.herenciatareaelectronica;

import java.util.ArrayList;

/**
 *
 * @author Luis Romero
 */
public class EquipoElectronico {

    private double precioFabricacion;
    private String codigo;
    private ArrayList<Componente> componentes;

    public EquipoElectronico(String cod) {
        this.codigo = cod;
        this.componentes = new ArrayList<>();
    }

    public double getPrecioFabricacion() {
        return this.precioFabricacion;
    }

    public ArrayList<Componente> getComponentes() {
        return this.componentes;
    }

    public void anadirComponente(Componente co) {
        if (this.componentes.size() < 10) {
            if (co instanceof ComponenteCaliente) {
                
                ComponenteCaliente comCa = (ComponenteCaliente) co;

                while (comCa.getTemperaturaActual() < comCa.getTemperaturaRequerida()) {
                    comCa.calentar();
                }
                componentes.add(comCa);
            }else
            componentes.add(co);
        }
    }

    public void calcularPrecioFabricacion() {
       double precioTotal = 0.0;

        for (Componente componente : componentes) {
            precioTotal += componente.getCosto();
        }

        precioFabricacion = precioTotal;
    } 
}
