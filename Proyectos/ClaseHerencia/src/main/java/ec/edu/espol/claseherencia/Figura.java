/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.claseherencia;

/**
 *
 * @author CltControl
 */

//CUando una clase tiene un Comportamiento  es abstracto
//Y solamente tienenen la firma y la palabra abstracta
//Comportaiento que no tiene cuerpo porque quiero que los hijos le de curerpo ejemplo perimetro
//Y obligo a que tenga perimetro
public abstract class Figura {
    protected int x; 
    protected int y;//Podemos usar el modificador Protect , permite acceso a los mismos clases y a sus subclases
//Protected derecho para sus hijos
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figura(int x) {
        this.x = x;
    }
    
    public Figura(){
        //valore default de los enteros primitivos
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String toString(){
    return this.x+","+this.y;
    
    }
    
     //COmportamineotPerimetro
    /*
    public double perimetro(){
        return  this.x+this.y;//puede tranforma entero a double implicita
        //Casting
        //double d=3.5
        //int x =(int) d;
        //sout =3
    }*/
    public abstract double perimetro();
        //return  this.x+this.y;//puede tranforma entero a double implicita
        //Casting
        //double d=3.5
        //int x =(int) d;
        //sout =3
    
}
