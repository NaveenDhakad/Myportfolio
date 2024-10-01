package org.emailsend ;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rn = new Random();
        int no = rn.nextInt(9000) + 999;

        System.out.println("Sending message through mail ");
        String message = "Hello Ananya this is your otp from Naveens side would you like " + no;
        String subject = "from portfolio ";

        String To = "mohitrathore8269@gmail.com";
        String from = "Naveendhakad489@gmail.com";
        sendMessage(message, subject, To, from);
    }

    public static void sendMessage(String message, String subject, String to, String from) {
        String host = "smtp.gmail.com";
        Properties properties = System.getProperties();
//		System.out.println(properties);
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
        protected  PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("Naveendhakad489@gmail.com","vobx byar hyin utay") ;
            }
        });
        session.setDebug(true);
        MimeMessage m = new MimeMessage(session);
        try {
            m.setFrom(from);
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setSubject(subject);
            m.setText(message);
            Transport.send(m);
            System.out.println("send successfully");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
