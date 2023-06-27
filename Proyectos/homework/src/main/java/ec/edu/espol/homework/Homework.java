/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.homework;

import ec.espol.edu.model.Array;
import ec.espol.edu.model.Buzon;
import ec.espol.edu.model.Mail;
import ec.espol.edu.model.Vector2D;
import java.util.Scanner;
/**
 *
 * @author Jonanyu 11.1
 */
public class Homework {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        Scanner entrada=new Scanner(System.in);
        
        //Validacion donde X y Y >=0
        Vector2D v1=new Vector2D (0,0);
        Vector2D v2=new Vector2D (0,0);
       
        do{
           v1=Vector2D.metodoScanner(entrada);
        
        }while(v1.getPosicionX()<=0 || v1.getPosicionY()<=0);
        
        do{
           v2=Vector2D.metodoScanner(entrada);
        
        }while(v2.getPosicionX()<=0 || v2.getPosicionY()<=0);
        
        //Vectores v1 y v2
        System.out.println("v1 "+v1);
        System.out.println("v2 "+v2+"\n");
   
        //Suma de vectores
        Vector2D v3=v1.sumar(v2);
        System.out.println("La suma de los vectores: "+v3);
        
        //Resta de vectores
        Vector2D v4=v1.restar(v2); 
        System.out.println("La resta de los vectores: "+v4+"\n");
        
        //Modulo
        double modulo= v3.modulo();
        System.out.println("El modulo del vector es: "+modulo);
        
        //Vector Unitario
        Vector2D vecUni=v3.vectorUnitario();
        System.out.println("El vector unitario es: "+vecUni);
        
        //Verifiacion los vectores son Iguales O no
        if (v1.equals(v2)==true) {
            System.out.println("Ambos vectores son iguales");
        }
        
        if (v1.equals(v2)==false) {
            System.out.println("Ambos vectores son diferentes");
        }
        
        System.out.println("Ejercicio 2");
        //Entrada de Dimensiones 
        Scanner input =new Scanner(System.in);
        
        Array ar1=Array.metScanner(input);
        System.out.println("Array 1: "+ar1);
        
        //Longitud del Array
        System.out.println("La longitud del Array1 es: "+ar1.size()+"\n");
        
        Scanner input2 =new Scanner(System.in);
        //Probando concat
        Array ar2=Array.metScanner(input2);
        System.out.println("Array 2: "+ar2);
        //Longitud del Array
        System.out.println("La longitud del Array2 es: "+ar2.size()+"\n");
        
        Array arConca=ar1.concat(ar2);
        System.out.println("El array Concatenado: ");
        System.out.println(arConca+"\n");
        System.out.println(ar1.get(4));
        //Solamente aplicamos
        ar1.set(3, 10);
        Array slice=ar1.Slicing(2, 6);
        System.out.println("Array Slicing : "+slice+"\n");

       //Array ar5= ar.Slicing(1, 5);ar
        System.out.println("La suma total del array es: "+ar1.sum());
        System.out.println("El maximo del array es: "+ar1.max());
        System.out.println("El minimo del array es: "+ar1.min()+"\n");
        
        //Compara sin son los mismos Array
        if (ar1.equals(ar2)) {
            System.out.println("Ambos array son iguales");
        }else{
            System.out.println("Ambos array son diferentes");
        }
        
        System.out.println("Ejercicio 3\n");
        
        Mail m1= new Mail("lfromero@espol.edu.ec","espol@.com","Mensaje a la Espol","La mejor Universidad");

        Buzon Buz= new Buzon();
        Buz.getMails().add(m1); 
        
        //Solicitar 5 objetos Mails por teclado y agregarlos al objeto buzón.
        for (int i = 0; i < 5; i++) {
            Mail m = Mail.askMail();
            Buz.getMails().add(m);
        }
        
        
        System.out.println(Buz.toString());
        
        //Solicitar un correo origen al usuario
        //Filtrando los Mails del buzón por este correo origen 
        //Mostrar Correo
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese correo origen");
        String origen = sc.next();
        
        System.out.print("Ingrese correo destino");
        String destino = sc.next();
        
        System.out.print(Buz.filtrarBuzonfromSrc(origen));
        System.out.print(Buz.filtrarBuzonfromDst(destino));
    
    }
    
}
