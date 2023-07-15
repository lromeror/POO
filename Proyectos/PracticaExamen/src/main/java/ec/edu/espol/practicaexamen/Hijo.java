/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.practicaexamen;

/**
 *
 * @author Jonanyu 11.1
 */
public class Hijo extends Padre {
      public static void m1() {
                System.out.println("De hijo m1()");
    }
      @Override
    public void m2() {
                System.out.println("De hijo m2()");
    }
    public void m2(String s){
        System.out.println(s);
        System.out.println("De hijo m2()");
    }
    public void m4(){
        
        System.out.println("De hijo m4()");
    }
}
