/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espol.edu.model;

import java.util.ArrayList;

/**
 *
 * @author Jonanyu 11.1
 */
public class Buzon {

    private ArrayList<Mail> mails;

    public Buzon() {
        mails = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        int i = 1;
        for (Mail x : this.mails) {
            if (i != mails.size() + 1) {
                s.append("{Mail#");
                s.append(i);
                i += 1;
                String s2 = "<from:" + x.getOrigen() + ",to:" + x.getDestino() + ",tittle:" + x.getTitulo() + ",message:" + x.getMensaje() + ">";
                s.append(s2);
                s.append(",");
            } else {
                s.append("{Mail#");
                s.append(i);
                i += 1;
                String s2 = "<from:" + x.getOrigen() + ",to:" + x.getDestino() + ",tittle:" + x.getTitulo() + ",message:" + x.getMensaje() + ">";
                s.append(s2);
                s.append("}");
            }
        }
        return s.toString();
    }

    public void addmail(Mail mail) {
        mails.add(mail);
    }

    public ArrayList<Mail> filtrarBuzonfromSrc(String origen) {
        ArrayList<Mail> FilteredMails = new ArrayList<>();
        for (int i = 0; i <= this.mails.size(); i++) {

            if (this.mails.get(i).getOrigen().equals(origen)) {
                FilteredMails.add(this.mails.get(i));
            }

        }
        return FilteredMails;
    }

    public ArrayList<Mail> filtrarBuzonfromDst(String destino) {
        ArrayList<Mail> FilteredMails = new ArrayList<>();
        for (int i = 0; i <= this.mails.size(); i++) {

            if (this.mails.get(i).getDestino().equals(destino)) {
                FilteredMails.add(this.mails.get(i));
            }

        }
        return FilteredMails;
    }

    public ArrayList<Mail> getMails() {
        return this.mails;
    }
}
