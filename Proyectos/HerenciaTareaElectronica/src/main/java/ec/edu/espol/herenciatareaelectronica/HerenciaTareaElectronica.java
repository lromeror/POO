/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espol.herenciatareaelectronica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis Romero
 */
public class HerenciaTareaElectronica {

    public static void main(String[] args) {

        System.out.println("Arma tu equipo");
        HerenciaTareaElectronica.armarEquipoElectronico();

    }

    public static Componente obtenerComponente(String nombre, ArrayList<Componente> componentes) {
        for (Componente co : componentes) {
            if (co.getNombre().equals(nombre)) {
                return co;
            }
        }
        return null;
    }

    public static void armarEquipoElectronico() {
        EquipoElectronico equi = new EquipoElectronico("EQUI01");

        Scanner input = new Scanner(System.in);

        int ncomponents;

        do {
            System.out.print("Ingrese el numero de componentes del equipo: ");
            ncomponents = input.nextInt();
            input.nextLine();
        } while ((ncomponents >= 10) || (ncomponents < 0));

        for (int i = 0; i < ncomponents; i++) {
            System.out.println("Componente " + (i + 1) + " info componente");
            System.out.print("Ingrese el nombre de la componente: ");
            String nombCompon = input.nextLine();
            System.out.print("Ingrese el costo de la componente: ");
            double costo = input.nextDouble();
            input.nextLine();

            System.out.println("La componente " + (i + 1) + " " + nombCompon + " es de tipo Caliente?");
            String res;
            do {
                System.out.print("S/N: ");
                res = input.nextLine();
                res = res.toUpperCase();

            } while ((!"S".equals(res)) && (!"N".equals(res)));
            if ("S".equals(res)) {
                System.out.print("Ingrese la temperatura de la componente: ");
                int temp = input.nextInt();
                input.nextLine();
                Componente co = new ComponenteCaliente(costo, nombCompon, temp);
                equi.anadirComponente(co);
            } else {
                Componente co = new Componente(costo, nombCompon);
                equi.anadirComponente(co);
            }

        }
        System.out.println("\n"); 
        System.out.print("Ingrese una componente a buscar: ");
        String componente = input.nextLine();

        Componente co = HerenciaTareaElectronica.obtenerComponente(componente, equi.getComponentes());
        System.out.println(co);
        equi.calcularPrecioFabricacion();
        System.out.println("El costo final del equipo es: " + equi.getPrecioFabricacion());

    }
}
