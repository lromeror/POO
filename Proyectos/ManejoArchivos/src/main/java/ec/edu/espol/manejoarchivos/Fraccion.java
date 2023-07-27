/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.manejoarchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Luis Romero
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }
    
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString(){
        return numerador + "/" + denominador;
    }

    //Si usamos esta logica lo qu esta mos haciendo es que cada vez
    //Estamos abriendo el canal y cerrando y haciendo eso parar cada vez
    //Que queremos escribir una fraccion
    //No es es buena practica
    public void saveFileAs(String nombre) {//Funcion de instancia
       try(BufferedWriter bw= new BufferedWriter(new FileWriter(nombre,true))){//No es necesario el close porque implementa AutoCloseable
              bw.write(this.toString());
              bw.newLine();
       }catch (IOException e){
       }
   }

   public static ArrayList<Fraccion> readFile(String nombre){
    ArrayList<Fraccion> fracciones = new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(nombre))){
            String linea;
            int cont=0;
            while((linea=br.readLine())!=null){
                String[] info=linea.split("/");
                cont++;
                try{//Captamos un error en tiempo de ejecucion 
                    //Por ende este seria un try no chequable
                    int numerador=Integer.parseInt(info[0]);
                    int denominador=Integer.parseInt(info[1]);
                    fracciones.add(new Fraccion(numerador,denominador));
                    
                }catch(NumberFormatException e){//Ponemos el nombre de la excepcion 
                    System.out.println("No se pudo convertir a entero en la linea "+cont);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
           // System.out.println("No se pudo leer el archivo");
        }
    return fracciones;
    //Como esta el try catch no se va a caer el programa sino que va a seguir y en este caso va a retornar un arraylist vacio
   }

   //En cambio aqui lo que hacemos es guardar en una lista y ahi
   //Arir el canal una vez y cerrarlo una vez
   public static void writeFile(ArrayList<Fraccion> fracciones,String nameFile){
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(nameFile))){
            for(Fraccion f: fracciones){
                bw.write(f.toString());
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}