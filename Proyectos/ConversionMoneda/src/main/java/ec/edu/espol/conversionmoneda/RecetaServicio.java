/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.conversionmoneda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rocio
 */
class Receta {
    private String nombre;
    private String dispositivo;
    public Receta(String nombre, String dispositivo) {
        this.nombre = nombre;
        this.dispositivo = dispositivo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDispotivo(){
        return dispositivo;
    }
}
 
class DispositivoInvalidoException  {
    //completar
}

public class RecetaServicio {
    public void cocinar(Receta receta, int tiempo, String dispositivo) {
        //completar
    }
    
    public static void main(String[] args){
        RecetaServicio recetaservicio = new RecetaServicio();
        List<Receta> recetas = new ArrayList<>();
        recetas.add(new Receta("crema batida","batidora"));
        recetas.add(new Receta("huevo frito","sarten"));
        Scanner sc = new Scanner(System.in);
        for(Receta r : recetas){
            System.out.println("Receta:"+r.getNombre());
            System.out.println("Ingrese tiempo de coccion en segundos");//en segundos
            int tiempo = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese dispositivo");
            String dispositvo = sc.nextLine();
            
            //completar
        }
    }
}
