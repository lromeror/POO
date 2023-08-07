/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.convertidoromano;
import java.util.Scanner;
/**
 *
 * @author Jonanyu 11.1
 */
public class ConvertidoRomano {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero a convertir en Romano");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int ans=numero/1000;
        int n=ans*1000;
        System.out.println(ans +" "+ n);

    }
}
