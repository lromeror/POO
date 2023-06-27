/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.claseherencia;

/**
 *
 * @author CltControl
 */
public class CirculoHiperbolico extends Circulo {
    private double elipse;

    public CirculoHiperbolico(double radio,double elipse) {
        super(radio);
        this.elipse=elipse;
    }

    public CirculoHiperbolico(int x, int y, double radio) {
        super(x, y, radio);
    }
    
    
    
}
