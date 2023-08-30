/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.calc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class Fraccion implements Serializable{
    private int numerador;
    private int denominador;
    private static final long serialVersionUID = 8799656478674716638L;

    public Fraccion(int numerador, int denominador) throws DenominadorException{
        if(denominador == 0)
            throw new DenominadorException("denominador con valor 0");
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public void saveFile(String nombre)
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombre,true));)
        {
            bw.write(this.numerador+"/"+this.denominador+"\n");
        }
        catch(IOException e)
        {
        }
    }
    public Fraccion sumar(Fraccion f)throws DenominadorException
    {
        int mcd = this.denominador * f.denominador;
        int num = (this.numerador * f.denominador) + (f.numerador * this.denominador);
        return new Fraccion(num,mcd);
    }
    public void saveSer(String nombre)
    {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombre));)
        {
            out.writeObject(this);
        }
        catch(IOException e)
        {
                
        }
        
    }
    
    public static void writeSer(String nombre, ArrayList<Fraccion> fracciones)
    {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombre));)
        {
            out.writeObject(fracciones);
        }
        catch(IOException e)
        {
                
        }
    }
    
    public static ArrayList<Fraccion> readSer(String nombre)throws Exception
    {
        ArrayList<Fraccion> fraccs = new ArrayList<>();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombre));
        fraccs = (ArrayList<Fraccion>)in.readObject();
        return fraccs;
    }
    public static ArrayList<Fraccion> readFile(String nombre)
    {
        ArrayList<Fraccion> fraccs = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(nombre));)
        {
            String line;//3/5
            while((line = br.readLine())!=null)
            {
                String[] tokens = line.split("/");
                try
                {
                    Fraccion f = new Fraccion(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]));
                    fraccs.add(f);
                }
                catch(NumberFormatException ne)
                {
                    
                }
                catch(DenominadorException d)
                {
                    
                }
                catch(ArrayIndexOutOfBoundsException ae)
                {
                    try
                    {
                        Fraccion f = new Fraccion(Integer.parseInt(tokens[0]),1);
                        fraccs.add(f);}
                    catch(DenominadorException e)
                    {
                    }
                }
                
            }
            
        }
        catch(IOException e)
        {
            
        }
        return fraccs;
    }
    
    public static void writeFile(String nombre, ArrayList<Fraccion> fraccs)
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombre));)
        {
            for(Fraccion f : fraccs)
            {
               bw.write(f.numerador+"/"+f.denominador+"\n");
            }
        }
        catch(IOException e)
        {
            
        }
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
    
    
}
