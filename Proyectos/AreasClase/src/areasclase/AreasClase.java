/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areasclase;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonanyu 11.1
 */
public class AreasClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        //Creacio de escoger el area de una figura


        System.out.print("Ingrese el area a realizar: ");

        String area=entrada.nextLine();
        //area=area.toLowerCase();//Convierto a minuscula lo que me pase el usuario

        if ("cuadrado".equals(area)){
            double lado, ans;
             //lado1;

            String lado1=JOptionPane.showInputDialog("Ingrese el lado del "+area);
            lado=Double.parseDouble(lado1);

            ans=Math.pow(lado, 2);

            System.out.println("El area del "+area+" es: "+ans);

        }else if("rectangulo".equals(area)){
            double base, altura,ans;

            String base1=JOptionPane.showInputDialog("Ingrese la base del "+area);
            base=Double.parseDouble(base1);

            String altura1=JOptionPane.showInputDialog("Ingrese la altura del"+area);
            altura=Double.parseDouble(altura1);

            ans=(base*altura);

            System.out.println("El area del "+area+" es: "+ans);
        }else if("triangulo".equals(area)){
            double base, altura,ans;

            String base1=JOptionPane.showInputDialog("Ingrese la base del "+area);
            base=Double.parseDouble(base1);

            String altura1=JOptionPane.showInputDialog("Ingrese la base del "+area);
            altura=Double.parseDouble(altura1);

            ans=(base*altura)/2;

            System.out.println("El area del "+area+" es: "+ans);
            
        }else if("circulo".equals(area)){
            double radio, ans;

            String radio1=JOptionPane.showInputDialog("Ingrese la base del "+area);
            radio=Double.parseDouble(radio1);

          
            ans=(Math.PI*(Math.pow(radio, 2)));

            System.out.println("El radio del "+area+" es: "+ans);
            
        }

    }
    
}
