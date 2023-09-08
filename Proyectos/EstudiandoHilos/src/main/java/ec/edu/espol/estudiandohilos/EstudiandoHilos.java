/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.estudiandohilos;

/**
 *
 * @author Jonanyu 11.1
 */
public class EstudiandoHilos {
    public static void main(String []args){
    //Uso de hilos pero que hagan extends de la clase Thread
    /*/
        HiloPrueba h1=new HiloPrueba("Luis");
        HiloPrueba h2=new HiloPrueba("Jose");
        h1.start();
        h2.start();
        System.out.println("Temrmina el thread main");
    }*/

    //Uso de la interface Runnable
    HiloRunnable hilo1=new HiloRunnable();
    HiloRunnable hilo2=new HiloRunnable();

    Thread h1=new Thread(hilo1,"Romero");
    Thread h2= new Thread(hilo2,"Rodriguez");

    h1.start();
    h2.start();
    System.out.println("Temrmina el thread main");
    }
}
