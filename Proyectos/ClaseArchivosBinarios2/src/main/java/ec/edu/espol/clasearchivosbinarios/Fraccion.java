/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.clasearchivosbinarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Fraccion implements Serializable{//Con esto tenemos la capacidad de converit a bytes
    private int numerado;
    private int denominador;
    private static final long serialVersionUID=8799656478674716638L;//Entonces sabemos que este es la version y no va a cambiare

    public Fraccion(int numerado, int denominador) {
        this.numerado = numerado;
        this.denominador = denominador;
    }

    public int getNumerado() {
        return numerado;
    }

    public void setNumerado(int numerado) {
        this.numerado = numerado;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public void saveSer(String nomfile){
        try(ObjectOutputStream out=new ObjectOutputStream( new FileOutputStream(nomfile))){
            //FileOutputStream f= new FileOutputStream(nomfile);
            //ObjectOutputStream out=new ObjectOutputStream(f);
            //No hay buffer directamente en bytes cada 2 byte
            //flush y close del canal con try con recursos
            out.writeObject(this);//Escribimos algunas coasas
                       
        }
        catch(IOException e){
        
        }
    }
    
    public static void writeSer(String nombre, ArrayList<Fraccion> fracciones){
        //Debemos de aseguraarnos que sea serializable el arrayList
        //
        try(ObjectOutputStream out=new ObjectOutputStream( new FileOutputStream(nombre))){          
            out.writeObject(fracciones);//Escribimos algunas coasas
        }
        catch(IOException e){
        
        }
        
    }
    
    public static ArrayList<Fraccion> readSer(String nombre){
        //Debemos de aseguraarnos que sea serializable el arrayList
        //
        ArrayList<Fraccion> fracciones= new ArrayList<>();
        try(ObjectInputStream input=new ObjectInputStream( new FileInputStream(nombre))){ 
            
            //Hacer downcasting
            
           fracciones =(ArrayList<Fraccion>)input.readObject();//Es porque el objecte es el padre de todos
           //Por ende un hijo no puede ser padre de un padre
           //Pero un hijo si puede ser hijo de una padre
        }
        catch(IOException  e ){//No es buena practica por seguridad
        
        }catch(ClassNotFoundException e){//Recomendacion para ver donde se cayo el programa
            
        }
        
        return fracciones;
    }
    
    public String toString(){
        return this.numerado+"/"+this.denominador;
    }
}
