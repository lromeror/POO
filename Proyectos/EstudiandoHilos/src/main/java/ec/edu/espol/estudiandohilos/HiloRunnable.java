/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.estudiandohilos;

/**
 *
 * @author Jonanyu 11.1
 */
public class HiloRunnable implements Runnable {
    //Thread.currentThread(), me da referencia del hilo que se esta ejecutando
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" - "+Thread.currentThread().getName());
        }
        System.out.println("Termina el thread"+" - "+Thread.currentThread().getName());
    }
    
}
