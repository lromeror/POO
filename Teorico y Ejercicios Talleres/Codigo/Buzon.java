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
public class Buzon {
    private ArrayList<Mail> correos;
    
    public Buzon(){
        this.correos = new ArrayList<>();
    }

    public ArrayList<Mail> getCorreos() {
        return correos;
    }
    
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("{");
        for(int i=0; i<this.correos.size();i++)
        {
            s.append("Mail #");
            s.append(i+1);
            s.append(":");
            Mail m = this.correos.get(i);
            s.append(m);
        }
        s.append("}");
        return s.toString();
    }
    
    public ArrayList<Mail> filtrarBuzonfromSrc(String origen)
    {
        ArrayList<Mail> res = new ArrayList<>();
        for(Mail m : this.correos)
        {
            if(Objects.equals(m.getOrigen(), origen))
                res.add(m);
        }
        return res;
    }
    
    public ArrayList<Mail> filtrarBuzonfromDst(String destino)
    {
        ArrayList<Mail> res = new ArrayList<>();
        for(Mail m : this.correos)
        {
            if(Objects.equals(m.getDestino(), destino))
                res.add(m);
        }
        return res;
    }
}
