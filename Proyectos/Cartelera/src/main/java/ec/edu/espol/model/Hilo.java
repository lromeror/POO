/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

/**
 *
 * @author Jonanyu 11.1
 */
public class Hilo extends Thread {

    public Hilo(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(this.getName() + " - " + (i + 1));
                Thread.sleep(1000);//Lo mando a dormir a el hilo de la clase
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());//Cuando el hilo esta dormido y los mandamos a matar
            }
        }
    }
}
