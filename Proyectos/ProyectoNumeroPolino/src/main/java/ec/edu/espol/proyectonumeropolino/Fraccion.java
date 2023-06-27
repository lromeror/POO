/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectonumeropolino;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonanyu 11.1
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador==0){
            this.denominador = denominador;
        }
        else {
            this.denominador = denominador;
        }
    }
    public Fraccion (int numerador){
            this(numerador,1);
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

    public void setDenominador(int denominador)  {
        if (denominador != 0)
            this.denominador = denominador;
    }
    //Esto es para suamr
    public Fraccion sumar(Fraccion f){
       
        int mcm = this.denominador * f.denominador;
        int num = (this.numerador*f.denominador)+(this.denominador*f.numerador);
        Fraccion res = new Fraccion (num,mcm);
        return res;
    
//    return new Fraccion (num,mcm);
    }
    
    @Override
//    Ejemplos de sobreescritura
    public String toString() 
    {
        return this.numerador+"/"+this.denominador;
    }
     
//     Ejemplos de sobrecarga 
//    public String toString(String h)
//    {
//        return "";
//    }

    public static Fraccion nextFraccion()
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de numerador>");
        int num = sc.nextInt();
        System.out.println("Ingrese el valor del denominador>");
        int den = sc.nextInt();
        return new Fraccion(num,den);
     }
     
    public static ArrayList<Fraccion> nextFraccion(int n)
    {
        ArrayList<Fraccion> fracciones = new ArrayList<>();
        for (int i=0; i<n; i++)
        {
            Fraccion f = nextFraccion();
            fracciones.add(f);
        }
        return fracciones;
    }
}
