/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.clasearchivosbinarios;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class ClaseArchivosBinarios {

    public static void main(String[] args) {
        //Para  escribir en bytes la clase debe tener la capacidad de Serizable que es una Interface 
        //Serializacion transforma a bytes
        //implements Seriazable
        //Para transmisitir necesitamos bytes
        //La interface Seriazable como tiene metodos default no estamos obligados a darle cuerpo a los metodos de esta interfaz
        //Out.flush();Es para liberar el canal
        //Podemos darle cualquier extension a nuestro archivo o nomfile
        //out.WriteObjeect(s1),
        //Serializable no tengo que lidiar con el formato 
        //Solamente Guardar una lista escribir una lista
        //Es muy tedioso poner en append
        //Es mejor trbajar en wrtite y guardar todo en una lista
        
        
       Fraccion f1=new Fraccion (3,4);
        Fraccion f2=new Fraccion (8,9);
        //f1.saveSer("fraccion.ser");//Al momento de ver en las files va aparecer como vacio pero no porque tenemos
        //java capacidad de leerr
        //SI la version es diferente no deja 
        ArrayList<Fraccion> fracciones=new ArrayList<>();
        fracciones.add(f1);
        fracciones.add(f2);
        
        Fraccion.writeSer("fracciones.docx", fracciones);
        
        ArrayList<Fraccion> fracciones2=Fraccion.readSer("fracciones.docx");//El simple hecho de cambiar 
         //ya me dice que no es la misma version
         //cuando la clase se actualiza ya me va a decir que esta desactualizado
         
         System.out.println(fracciones2);
         //Serializar Pila
         
         
         
         //Forma de ponerle version de a la serializacion, es un atributo no global depende de cada clase
         
         
         //transient es basicmante cunado no lo queremos a converit en byte o serilarize pero cuando lo lea lo manda como default
         //SI una clase implemente serializable todas las hijas tambien son serializable
         //Los atributos deben ser serializable para poder hace la serializacion
         //Los atributos estaticos no se serializan 
    }
}
