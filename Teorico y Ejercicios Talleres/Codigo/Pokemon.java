/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Pokemon {
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;
    private int resistencia;

    public Pokemon(String nombre, String tipo, int ataque, int defensa, int resistencia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
    public void atacar(Pokemon p)
    {
        if(this.ataque > p.defensa)
           p.resistencia -= this.ataque;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        return Objects.equals(this.nombre,other.nombre) && Objects.equals(this.tipo,other.tipo);
    }
    
    @Override
    public String toString()
    {
        return "<Pokemon-> nombre:"+this.nombre+", tipo:"+this.tipo+", ataque:"+this.ataque+", defensa:"+this.defensa+", resistencia:"+this.resistencia+" >";
    }
    
    public static Pokemon nextPokemon(Scanner sc)
    {
        System.out.println("Ingrese el nombre del pokemon>");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el tipo del pokemon>");
        String tipo = sc.nextLine();
        int ataque;
        do{
            System.out.println("Ingrese el valor de ataque del pokemon>");
            ataque = sc.nextInt();
        }while(ataque<=0);
        int defensa;
        do{
            System.out.println("Ingrese el valor de ataque del pokemon>");
            defensa = sc.nextInt();
        }while(defensa<=0);
        int resistencia;
        do{
            System.out.println("Ingrese el valor de ataque del pokemon>");
            resistencia = sc.nextInt();
        }while(resistencia<=0);
        sc.nextLine();
        return new Pokemon(nombre, tipo, ataque, defensa, resistencia);
    }

}
