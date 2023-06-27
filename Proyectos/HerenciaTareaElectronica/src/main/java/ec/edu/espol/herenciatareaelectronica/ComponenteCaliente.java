/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.herenciatareaelectronica;

/**
 *
 * @author Luis Romero
 */
public class ComponenteCaliente extends Componente {

    private int temperaturaRequerida;
    private int temperaturaActual;

    public ComponenteCaliente(double costo, String nombre, int tr) {
        super(costo, nombre);
        this.temperaturaRequerida = tr;
        this.temperaturaActual = 20;
    }

    public int getTemperaturaRequerida() {
        return temperaturaRequerida;
    }

    public int getTemperaturaActual() {
        return temperaturaActual;
    }

    //Sobreescribir el metodo get costo
    @Override
    public double getCosto() {

        if ((super.getCosto() >= 0) && (super.getCosto() <= 30)) {
            return super.getCosto() + (super.getCosto() * 0.10);
        } else if ((super.getCosto() > 30) && (super.getCosto() <= 100)) {
            return super.getCosto() + (super.getCosto() * 0.20);
        } else {
            return super.getCosto() + (super.getCosto() * 0.50);
        }
    }

    public void calentar() {
        this.temperaturaActual += 1;
    }

    @Override
    public String toString() {
        return "Componente <" + this.getNombre() + ">-calentado a <" + this.temperaturaActual + ">-precio <" + this.getCosto() + ">";
    }

}
