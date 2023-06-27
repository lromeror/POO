/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectonumeros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonanyu 11.1
 */
public class Fraccion {
    //Atributos
    private int numerador;
    private int denominador;

//Constructores
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador == 0) {
            this.denominador = 1;
        }
        this.denominador = denominador;
    }

    public Fraccion(int numerador) {
        this(numerador, 1);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador != 0) {
            this.denominador = denominador;
        }
    }

    public Fraccion sumar(Fraccion f) {
        int mcd = this.denominador * f.denominador;
        int num = (this.numerador * f.denominador) + (this.denominador * f.numerador);

        //1er paso Creo una nueva instancia o objeto y luego retorno
        Fraccion res = new Fraccion(num, mcd);
        return res;

    }
    //Sobrecarga no ncesariamente uso un contrusctor

    //Sobreescritura
    //Convirtiendo o sobreescibiendo a la herencia de object
    @Override
    public String toString() {//this vuelve hacer referencia al objeto
        //No es necesario un 
        return this.numerador + "/" + this.denominador;

    }

    //COmportamiento  
    public static Fraccion nextFraccion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de un numerador");
        int num = sc.nextInt();
        System.out.println("Ingrese el valor de denominador");
        int dem = sc.nextInt();
        return new Fraccion(num, dem);
    }

    //Sobrecarga mismo nombre y diferente argumento tipo de dato
    public static ArrayList<Fraccion> nextFracion(int n){
        ArrayList<Fraccion>fracciones =new ArrayList<>();
        for (int i=0;i<n;i++){
        Fraccion f=Fraccion.nextFraccion();
        fracciones.add(f);
        }
        
        return fracciones;
    }
}
