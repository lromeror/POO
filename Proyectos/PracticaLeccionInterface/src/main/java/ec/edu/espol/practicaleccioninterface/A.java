/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espol.practicaleccioninterface;

/**
 *
 * @author Jonanyu 11.1
 */
public interface A {
    default int num(){
        return 100;
    }
    
    static int num2(){
           return 50;
    }
    
    default int num3(){
        return 70;
    }
    
    int obtnernumero();
    
}
