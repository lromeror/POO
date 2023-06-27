/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espol.edu.model;

import java.util.Scanner;

/**
 *
 * @author Jonanyu 11.1
 */
public class Array {

    //Atributos
    private int[] arrEnteros;

    //Constructor
    public Array(int longi) {
        this.arrEnteros = new int[longi];
    }

    public Array() {
        this.arrEnteros = new int[10];
    }

    public int size() {
        int length = this.arrEnteros.length;
        return length;
    }

    public int[] getArrEnteros() {
        return arrEnteros;
    }

    public Array concat(Array ar) {
        int lengthnew = this.size()+ar.size();
        Array new_array = new Array(lengthnew);
        
        for(int i=0 ; i < this.size() ; i++){
            new_array.getArrEnteros()[i] = this.getArrEnteros()[i];
        }

        for(int u = this.size()-1 ; u < ar.size(); u++){
            new_array.getArrEnteros()[u] = ar.getArrEnteros()[u];
        }
        return new_array;
    }

    public int get(int indice) {
        if (indice > this.size() - 1) {
            return -1;
        } else {
            return this.getArrEnteros()[indice];
        }
    }

    public void set(int indice, int entero) {
        int rangoFin = this.size() - 1;
        if (indice <= rangoFin) {
            this.getArrEnteros()[indice] = entero;
        }
    }

    public Array Slicing(int InicioInd, int finalInd) {
        int rango = this.size() - 1;
        if (finalInd > rango || InicioInd < 0) {
            return null;
        } else {
            int cantSlice = finalInd - InicioInd;
            Array slice = new Array(cantSlice);
            int h = 0;
            for (int i = InicioInd; i <= cantSlice; i++) {
                slice.getArrEnteros()[h++] = this.getArrEnteros()[i];
            }
            return slice;
        }
    }

    public int sum() {
        int sumar = 0;
        for (int i = 0; i < this.size(); i++) {
            sumar = this.getArrEnteros()[i] + sumar;
        }
        return sumar;
    }

    public int max() {
        int max = -1000000000;
        for (int i = 0; i < this.size(); i++) {
            if (this.getArrEnteros()[i] > max) {
                max = this.getArrEnteros()[i];
            }
        }
        return max;
    }

    public int min() {
        int min = 1000000000;
        for (int i = 0; i < this.size(); i++) {
            if (this.getArrEnteros()[i] < min) {
                min = this.getArrEnteros()[i];
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.size(); i++) {
            int n = this.getArrEnteros()[i];
            s.append(" ").append(n).append(" ");
        }
        s.append("]");
        return s.toString();
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) {
            return false;
        }
        if (this == ob) {
            return true;
        }
        if (this.getClass() != ob.getClass()) {
            return false;
        }

        Array auxArray = (Array) ob;

        if (this.size() != auxArray.size()) {
            return false;
        }

        boolean compa = true;
        for (int i = 0; i < this.size(); i++) {
            if (this.getArrEnteros()[i] != auxArray.getArrEnteros()[i]) {
                compa = false;
                break;
            }
        }
        return compa;
    }

    public static Array metScanner(Scanner input) {
        
        System.out.print("Ingrese la dimension del Array: ");
        int dimen = input.nextInt();

        Array arrayInput = new Array(dimen);

        for (int i = 0; i < dimen; i++) {
            System.out.print("Ingrese el valor de la componente: ");
            int comp = input.nextInt();
            arrayInput.getArrEnteros()[i] = comp;
        }
        return arrayInput;
    }
}
