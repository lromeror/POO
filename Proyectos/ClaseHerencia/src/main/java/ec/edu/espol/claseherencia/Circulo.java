/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.claseherencia;

/**
 *
 * @author CltControl
 */

//Superclase no hereda nada de la subclase
//Pero la subclase 
public class Circulo extends Figura {
    private double radio;
    //en caso de no tener y crear un nuevo x en la subclase y tener otra en el padre
    //Crea una nueva x diferente a la del padre NO ES LA MISMA
    //this refiere al de la propia clase 
    //Pero podemos super.x ahi me refiero a la x que cree en el padre esto vale para metodos y atributos
    //en caso usar this para el de la misma clase
    //PERO SIEMPRE LA RELACION A NIVEL DE 2 CLASE PADRE E HIJO AUNQUE HAIGA MAS
    
    

    public Circulo(double radio) {
        //super(0);//Llamando al otro constructor de Figrua
        this(0,0,radio);
        this.radio=radio;
    }

    public Circulo(){
    //No pasaria nada si existe un default de figura
    }
    
    public Circulo(int x, int y, double radio){
        super(x,y);//Llamando al super constructor de la clase Figura
        //La unica forma de que no ponga super es que yo defina el default en la clase padre
        //Pero cuando no es ncesario usar
        this.radio=radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public String toString(){//Nopodemos llamar a otra clase ciertos atribtutos poorque esta en private
        return "(x:"+this.getX()+",Y:"+this.getY()+",radio: "+this.radio+")";//Usamos this pero con el get para obtener el rusltado ya que estaba privado
    //una vez potected ya no es necesario usar los modificadores de acceso
    }
    
   
    //Sobrescritura del metodo perimetro de la clase padre a la de la hijo
    @Override
    public double perimetro(){
    return 2*Math.PI*this.radio; 
    }
    
}
