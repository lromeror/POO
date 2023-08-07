/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.practicaleccioninterface;

/**
 *
 * @author Jonanyu 11.1
 */
public class PracticaLeccionInterface {

    public static void main(String[] args) {
       /* A ob=new ClassA(2,5);
        System.out.println(ob.num());
        
        System.out.println(A.num2());//Aunque tenga el default no se la puede invocar como statica
        
        A ob2=new ClassA(1,1);
        System.out.println(ob2.num3());//Como no esta sobrescrtio asi que pilas
        */
       
     ClassA obj =new B(2,4);
     int m=obj.obtnernumero();
        System.out.println(m);
    }
    
 
}
