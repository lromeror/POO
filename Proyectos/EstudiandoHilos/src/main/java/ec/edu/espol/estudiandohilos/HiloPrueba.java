/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.estudiandohilos;

/**
 *
 * @author Jonanyu 11.1
 */
public class HiloPrueba extends Thread{
    
    public HiloPrueba(String msg){
        super(msg);
    }
    
    //sobreescritura del metodo run 
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+ " - "+this.getName());
        }
        System.out.println("Hilo terminado" +this.getName());
    }
}
