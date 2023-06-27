/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.practicahom3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonanyu 11.1
 */
public class PracticaHom3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
            List<String> lista= new ArrayList<String>();
    lista.add("hola");
    lista.add("que");
    lista.add("tal");
    lista.add("estas");
    
    for (int i=0;i<lista.size();i++) {
      
      System.out.println(lista.get(i));
    }
    }
}
