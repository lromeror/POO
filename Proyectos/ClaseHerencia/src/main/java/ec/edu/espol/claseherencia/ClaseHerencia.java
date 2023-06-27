/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.claseherencia;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class ClaseHerencia {

    public static void main(String[] args) {
       Circulo c1=new Circulo(2.5);
       Circulo c2=new Circulo(1,2,3.5);
        System.out.println(c1.getX());//Estos getter y setter los hereda de la superclase
        System.out.println(c1.getRadio());//Solo debemos crearlos para los especificos en la subclase
        System.out.println(c1);//Va usar el to string de cada subcclase
        //Pero en caso de no tener to string cada subclase 
        System.out.println(c2.perimetro());
        
        Figura f=new Circulo(2.5);
        System.out.println(f.perimetro());//En caso de borra perimetro en FIGURA clase 
        //Necesita downcasting
        
        System.out.println();
        
        Circulo cf=(Circulo)f;//Solo lo hacemos cuando hay inicalizacion polimorfica
        //es como f toma todos las propiedades igual que circulo
        
        ArrayList<Figura> figuras=new ArrayList<>();
        //Puedo agregar cualquiere figura de diversas clases
        figuras.add(c1);//Podemos agregar circulo es una figura
        figuras.add(c2);
        
        double acumu=0;
        for (Figura f1:figuras){
            Circulo cn=(Circulo)f1;//Pero esto si e de Circulo
            acumu+=cn.getRadio();
        }
    }
}
