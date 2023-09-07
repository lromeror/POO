/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.classes;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D(double x) {
        this.x = x;
        this.y = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Vector2D sumar(Vector2D v)
    {
        return new Vector2D(this.x+v.x, this.y+v.y);
    }
    
    public Vector2D restar(Vector2D v)
    {
        return new Vector2D(this.x+v.x, this.y+v.y);
    }
    
    public double modulo()
    {
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }
    
    public Vector2D unitario()
    {
        double modulo = this.modulo();
        return new Vector2D(this.x/modulo,this.y/modulo);
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
        Vector2D other = (Vector2D)obj;
        return this.x == other.x && this.y == other.y;
    }
    
    public String toString()
    {
        return "v=("+this.x+","+this.y+")";
    }
    
    public static Vector2D nextVector(Scanner sc)
    {
        System.out.println("Ingrese el valor x del vector>");
        double x = sc.nextDouble();
        System.out.println("Ingrese el valor y del vector>");
        double y = sc.nextDouble();
        return new Vector2D(x,y);
    }
}
