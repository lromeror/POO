/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.excepcionespoo;

/**
 *
 * @author CltControl
 */
public class ExcepcionesPOO {

    public static void main(String[] args) {
     //Throw solamente dispara o lanza excepciones
     //Exception a runtime.- se dispara en tiempo de ejecucion en runtime excepciones
     //Chequeables
     //Se disparan en tiempo de complicacion, obliado a darle traramiento eje: IOException
     //todas la que heredan de Exception menos el RuntimeException
     //No chequeablec
     //Son las que heredan de runtime exception
     
     
     //Todas heredan del Exception menos las del runtime exception
     //Mejor poner individualizada
     /*
     Checked Exceptions
     1- Encerrarlo en un bloque try catch
     2- Pasarle el problema a quien me llama
     public void afiliarSocio(String cedula) throws Exception, classNotFoundException; quien lo llama debe tratar   
     
     */
     
     /*
     No chquqeables no avisan porque no se maneja en tiempo de compilacion sino de ejecucion
     No es obligacion pero si puedo dar manejo
     y puedo lanzarlo tambien
     */
     
     //Varios cacht para un mismo try
     //Primero las especificas y despues las generales
     
     
     
     //BLOQUE finally
     //No tinee argumento
     //Se ejecuta cuando haya o no haya excepciones
     
   
    }
}
