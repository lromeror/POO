/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectonumeros;

/**
 *
 * @author Jonanyu 11.1
 */
public class Polinomio {
    private int grado;
    private int[] coeficientes;
    
    public Polinomio(int grado)
    {
        this.grado = grado;
        this.coeficientes = new int[grado+1];
    }
    public Polinomio(int[] coeficientes)
    {
        this.coeficientes =coeficientes;
        this.grado = coeficientes.length -1;
    }

    public int getGrado() {
        return grado;
    }
    public int[] getCoeficientes() {
        return coeficientes;
    }

    public void setCoeficientes(int[] coeficientes) {
        this.coeficientes = coeficientes;
    }
    
    public Polinomio sumar (Polinomio p)
    {
        int mayor = Math.max(this.grado, p.grado);
        Polinomio res = new Polinomio(mayor);
        for (int i=0; i<=this.grado; i++)
        {
            res.coeficientes[i] += this.coeficientes[i];
        }
        for (int i=0; i<=this.grado; i++)
        {
            res.coeficientes[i] += p.coeficientes[i];
        }
        return res;
    }
}
