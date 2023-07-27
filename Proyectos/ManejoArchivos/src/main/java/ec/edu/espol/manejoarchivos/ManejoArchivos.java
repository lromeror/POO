/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.manejoarchivos;

import java.util.ArrayList;

/**
 *
 * @author Jonanyu 11.1
 */
public class ManejoArchivos {

    public static void main(String[] args) {
        /*Fraccion f1=new Fraccion(3,5);
        Fraccion f2 =new Fraccion(4,7);
        Fraccion f3=new Fraccion(5,8);
        Fraccion f4=new Fraccion(6,9);
        Fraccion f5=new Fraccion(7,10);
        Fraccion f6=new Fraccion(8,11);
        Fraccion f7=new Fraccion(9,12);
        Fraccion f8=new Fraccion(10,13);    
        Fraccion f9=new Fraccion(11,14);        
        Fraccion f10=new Fraccion(12,15);  */  

        //ArrayList<Fraccion> fracciones = new ArrayList<>();
       
       // for (int i = 0; i < 30; i++) {
         //   fracciones.add(new Fraccion(i+1,i+2));
        //}

        //No es recomentdable hacer esto
        /*
        for(Fraccion f: fracciones){
            f.saveFileAs("Fracciones.csv");
        }*/
        ArrayList<Fraccion> fracciones=Fraccion.readFile("Fracciones1.csv");
        fracciones.remove(1);
        fracciones.remove(8);
        Fraccion.writeFile(fracciones, "Fracciones2.csv");


        //System.out.println(Fraccion.readFile("Fracciones.csv"));//Como esta el try no se va a caer el programa sino que 
        //Va imprimir el mensaje de error y va a saltar ese codigo y va a  seguir ejecutando el programa
        
    }
}
