/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.classes;

import ec.edu.espol.classes.Dueno;
import java.util.ArrayList;

/**
 *
 * @author Jonanyu 11.1
 */
public class Mascota {
    int id;
    String nombre;
    String raza;
    String fecha;
    char tipo;
    int id_dueno;
    Dueno dueno;
    ArrayList<Inscripcion> inscripciones;
}
