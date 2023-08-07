/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.tareapolinomio;

import java.util.ArrayList;

/**
 *
 * @author Luis Romero
 */
public class TareaPolinomio {

    public static void main(String[] args) {
        ArrayList<Polinomio> polinomios= new ArrayList<>();
        int[] valoreCoe={4,5,6,3,1,8,12};
        int[] valoreCoe2={5,1,0,6};
        int[] valoresCoe3={6,7,5};
        int[] valoresCoe4={5,9,2,0,3,6};

        Polinomio p=new Polinomio(valoreCoe);
        Polinomio p2= new Polinomio(valoreCoe2);
        Polinomio p3= new Polinomio(valoresCoe3);
        Polinomio p4=new Polinomio(valoresCoe4);

        polinomios.add(p);
        polinomios.add(p2);
        polinomios.add(p3);
        polinomios.add(p4);
        
        Polinomio.saveListToFile("Polinomios.txt", polinomios);
        p.saveFile("Polinomios.txt");
        p2.saveFile("Polinomios.txt");
        p3.saveFile("Polinomios.txt");
        p4.saveFile("Polinomios.txt");
         ArrayList<Polinomio> poli=Polinomio.readListFromFIle("Polinomios.txt");
        System.out.println(poli);

        //Polinomio.saveListToFileSer("Polinomios.ser", polinomios);
        System.out.println(Polinomio.readListFromFileSer("Polinomios.ser"));
    }
}
