/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.classes;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Array {
    private int[] array;
    
    public Array(int n)
    {
        this.array = new int[n];
    }
    public Array()
    {
        this.array = new int[10];
    }
    public int size()
    {
        return this.array.length;
    }
    public int get(int index)
    {
        if(index>=0 && index<this.array.length)
            return this.array[index];
        else
            return -1;
    }
    public void set(int index, int valor)
    {
        if(index>=0 && index<this.array.length)
            this.array[index]=valor; 
    }
    public Array concat(Array a)
    {
        Array res = new Array(this.array.length+a.array.length);
        for(int i=0; i<this.array.length; i++)
            res.array[i] = this.array[i];
        for(int i=this.array.length;i<res.array.length;i++)
            res.array[i] = a.array[i-this.array.length];
        return res;
    }
    
    public Array slicing(int inicio, int fin)
    {
        
        if(fin>inicio && inicio>=0 && fin<this.array.length)
        {
            Array res = new Array(fin-inicio);
            for(int i=inicio; i<fin; i++)
                res.array[i-inicio] = this.array[i];
            return res;
        }
        return null;
    }
    public int max()
    {
        int max = this.array[0];
        for(int i=1;i<this.array.length;i++)
        {
            if(this.array[i]>max)
                max = this.array[i];
        }
        return max;
    }
    public int min()
    {
        int min = this.array[0];
        for(int i=1;i<this.array.length;i++)
        {
            if(this.array[i]<min)
                min = this.array[i];
        }
        return min;
    }
    public int sum()
    {
        int acum=0;
        for(int i=1;i<this.array.length;i++)
            acum+=this.array[i];
        return acum;
    }
    public static Array nextArray(Scanner sc)
    {
        System.out.println("Ingrese la dimension del array>");
        int n = sc.nextInt();
        Array res = new Array(n);
        for(int i=0;i<n;i++)
        {
            System.out.println("Ingrese el coeficiente "+i+">");
            res.array[i] = sc.nextInt();
        }
        return res;
    }
    @Override
    public boolean equals(Object o)
    {
        if(o == null)
            return false;
        if(o == this)
            return true;
        if(o.getClass()!=this.getClass())
            return false;
        Array other = (Array)o;
        if(this.array.length!=other.array.length)
            return false;
        for(int i=0; i<this.array.length; i++)
        {
            if(this.array[i]!=other.array[i])
                return false;
        }
        return true;
    }
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i=0 ; i<this.array.length; i++)
        {
            s.append(this.array[i]);
            if(i!=this.array.length-1)
                s.append(", ");
        }
        s.append("]");
        return s.toString();
    }
}
