/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.classes;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author eduardo
 */
public class Pokedex {
    private ArrayList<Pokemon> pokemones;
    
    public Pokedex()
    {
        this.pokemones = new ArrayList<>();
    }
    
    public void addPokemon(Pokemon p)
    {
        this.pokemones.add(p);
    }
    
    public ArrayList<Pokemon> filtrarPorTipo(String tipo)
    {
        ArrayList<Pokemon> res = new ArrayList<>();
        for(Pokemon p : this.pokemones)
        {
            if(Objects.equals(p.getTipo(), tipo))
                res.add(p);
        }
        return res;
    }
}
