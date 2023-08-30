/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jonanyu 11.1
 */
public class Pelicula implements Serializable{
    private String titulo;
    private String sinopsis;
    private String categoria;
    private String nomfile;
    private static final long serialVersionUID = 8799656478674716638L;

    public Pelicula(String titulo, String sinopsis, String categoria, String nomfile) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.categoria = categoria;
        this.nomfile = nomfile;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNomfile() {
        return nomfile;
    }

    public void setNomfile(String nomfile) {
        this.nomfile = nomfile;
    }
    public static void guardarPeliculas(ArrayList<Pelicula> peliculas, String nomfile){
        try(FileOutputStream file = new FileOutputStream(nomfile);
                ObjectOutputStream out = new ObjectOutputStream(file)){
            out.writeObject(peliculas);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static ArrayList<Pelicula> leerPeliculas(String nomfile){
        try(FileInputStream file = new FileInputStream(nomfile);
                ObjectInputStream in = new ObjectInputStream(file)){
            ArrayList<Pelicula> peliculas =  (ArrayList<Pelicula>)in.readObject();
            return peliculas;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }
    
    public static ArrayList<String> categoriasUnicas(ArrayList<Pelicula> peliculas){
        ArrayList<String> categorias = new ArrayList<>();
        for(Pelicula p : peliculas){
            if(!categorias.contains(p.getCategoria()))
                categorias.add(p.getCategoria());       
        }
        return categorias;
    }
    public static ArrayList<Pelicula> filtrarCategorias(ArrayList<Pelicula> peliculas, String categoria){
        ArrayList<Pelicula> categorias = new ArrayList<>();
        for(Pelicula p : peliculas){
            if(p.getCategoria().equals(categoria))
                categorias.add(p);
        }
        return categorias;
    }
    public static Pelicula filtrarTitulo(ArrayList<Pelicula> peliculas, String titulo){
        
        for(Pelicula p : peliculas){
            if(p.titulo.equals(titulo))
                return p;
        }
        return null;
    }
    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", sinopsis=" + sinopsis + ", categoria=" + categoria + ", nomfile=" + nomfile + '}';
    }
    
}
