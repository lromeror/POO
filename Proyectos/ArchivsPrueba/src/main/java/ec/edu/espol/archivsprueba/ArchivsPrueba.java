/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.archivsprueba;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Jonanyu 11.1
 */
public class ArchivsPrueba implements Serializable {
private int i =10;
public int j=20;
transient int k=30;
public static int l=40;
private int m;
    public static void main(String[] args) throws Exception {
      ArchivsPrueba input= new ArchivsPrueba();
      ObjectOutputStream obout=new ObjectOutputStream( new FileOutputStream ("HOLA.ser"));
      obout.writeObject(input);
      
      ObjectInputStream read=new  ObjectInputStream(new FileInputStream("HOLA.ser"));
      ArchivsPrueba read1=(ArchivsPrueba)read.readObject();
      
        System.out.println(read1.i);
        System.out.println(read1.j);
        System.out.println(read1.k);
        System.out.println(read1.l);
        System.out.println(read1.m);
    }
}
