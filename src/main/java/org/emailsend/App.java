package org.emailsend ;

import static spark.Spark.*;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;


import java.util.Properties;

public class App {
    public static void main(String[] args) {
        enableCORS("https://myportfolio-sigma-blush.vercel.app");

        // Set up a simple GET route
        get("/myportfolio-production-804c.up.railway.app/Servlet", (req, res) -> {
            return "Hello from Railway!";
        });

        // Set up a POST route
        post("/myportfolio-production-804c.up.railway.app/Servlet", (req, res) -> {
            String requestData = req.body();  // Get data from request body
            // Process the data here
            return "Data received: " + requestData;
        });
           }
    private static void enableCORS(String origin) {
        options("/*", (request, response) -> {
            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }
            return "OK";
        });

        before((request, response) -> {
            response.header("Access-Control-Allow-Origin", origin);
            response.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        });
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
