/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.proyect2;

import ec.edu.espol.classes.Pokedex;
import ec.edu.espol.classes.Pokemon;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pokedex pkd = new Pokedex();
        for(int i=0; i<5; i++)
        {
            Pokemon p = Pokemon.nextPokemon(sc);
            pkd.addPokemon(p);
        }
        System.out.println("Ingrese un tipo>");
        String tipo = sc.nextLine();
        ArrayList<Pokemon> pokemones = pkd.filtrarPorTipo(tipo);
        Pokemon p1 = pokemones.get(0);
        Pokemon p2 = pokemones.get(1);
        p1.atacar(p2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
