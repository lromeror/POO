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
public class Vector2D {

    //Atributos
    private double posicionX;
    private double posicionY;

    //Contructor
    public Vector2D(double posicionX, double posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    //Sobrecarga
    public Vector2D(double posicionX) {
        this(posicionX, 0);
    }

    //Modificadores de Acceso
    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    //Metodo Sumar
    public Vector2D sumar(Vector2D vec) {

        double resX = this.posicionX + vec.getPosicionX();
        double resY = this.posicionY + vec.getPosicionY();

        Vector2D vectorRes = new Vector2D(resX, resY);
        return vectorRes;
    }

    //Metodo Restar
    public Vector2D restar(Vector2D vec) {

        double resX = this.posicionX - vec.getPosicionX();
        double resY = this.posicionY - vec.getPosicionY();

        Vector2D vectorRes = new Vector2D(resX, resY);
        return vectorRes;
    }

    //Metodo Modulo
    public double modulo() {
        double cuadradoX = Math.pow(this.posicionX, 2);
        double cuadradoY = Math.pow(this.posicionY, 2);

        double modulo = Math.sqrt(cuadradoX + cuadradoY);

        return modulo;
    }

    //Metodo Vector Unitario
    public Vector2D vectorUnitario() {
        double modulo = this.modulo();
        double posX = this.getPosicionX() / modulo;
        double posY = this.getPosicionY() / modulo;
        Vector2D vectorUnitario = new Vector2D(posX, posY);
        return vectorUnitario;

    }

    //Sobrescritura del ToString
    @Override
    public String toString() {
        return "v=(" + this.posicionX + "," + this.posicionY + ")";
    }

    //Metodo Equals
    @Override
    public boolean equals(Object ob) {
        if (ob == null) {
            return false;
        }

        if (this == ob) {
            return false;
        }

        if (this.getClass() != ob.getClass()) {
            return false;
        }

        Vector2D v = (Vector2D) ob;

        return (this.posicionX == v.getPosicionX() && this.posicionY == v.getPosicionY());
    }

    //Creacion de metodo Estatico
    public static Vector2D metodoScanner(Scanner entrada) {

        System.out.print("Ingrese una pocision X: ");
        double posX = entrada.nextDouble();
        System.out.print("Ingrese una pocision Y: ");
        double posY = entrada.nextDouble();

        Vector2D vector = new Vector2D(posX, posY);
        return vector;
    }

}
