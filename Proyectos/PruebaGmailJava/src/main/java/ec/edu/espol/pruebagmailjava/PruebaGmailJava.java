package ec.edu.espol.pruebagmailjava;


import java.util.*;
import javax.mail.Message;

import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.mail.Transport;


public class PruebaGmailJava {
  public static void main(String[] args) {
    String destinatario =  "lfromero@espol.edu.ec"; //A quien le quieres escribir.
    String asunto = "Correo de prueba enviado desde Java";
    String cuerpo = "Esta es una prueba de correo...";

    enviarConGMail(destinatario, asunto, cuerpo);
  }

  private static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
    //La dirección de correo de envío
    String remitente = "romeroluisfer1807@gmail.com";
    //La clave de aplicación obtenida según se explica en este artículo:
    String claveemail = "jlntgglfiujhhbxx";

    Properties props = System.getProperties();
    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
    props.put("mail.smtp.user", remitente);
    props.put("mail.smtp.clave", claveemail);    //La clave de la cuenta
    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

    Session session = Session.getDefaultInstance(props);
    MimeMessage message = new MimeMessage(session);

    try {
        message.setFrom(new InternetAddress(remitente));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));   //Se podrían añadir varios de la misma manera
        message.setSubject(asunto);
        message.setText(cuerpo);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", remitente, claveemail);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    catch (MessagingException me) {
        me.printStackTrace();   //Si se produce un error
    }
  }
}