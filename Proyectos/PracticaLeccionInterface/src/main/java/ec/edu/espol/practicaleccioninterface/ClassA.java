/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.practicaleccioninterface;

/**
 *
 * @author Jonanyu 11.1
 */
public abstract class ClassA implements A {
    
    int n1;
    int n2;

    public ClassA(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    @Override
    public int num(){//Es valido flaco
        return this.n1+20;//Y podemos sobreescrbir lo
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public abstract int obtnernumero();
}
