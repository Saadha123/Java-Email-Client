import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

// class to send the email
public class SendEmail {

    public static void SendEmail(String input) {
        try {
            String[] emailData = input.split(",");
            Email email = new Email(emailData[0].strip(), emailData[1].strip(), emailData[2].strip());

            final String username = "saadhatest@gmail.com";
            final String password = "geiyirlnqwppflvu";

            Properties prop = new Properties();
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.starttls.enable", "true"); //TLS
            prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");

            Session session = Session.getInstance(prop,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("saadhatest@gmail.com"));
                message.setRecipients(
                        Message.RecipientType.TO,
                        InternetAddress.parse(email.getEmailTo())
                );
                message.setSubject(email.getSubject());
                message.setText(email.getContent());

                Transport.send(message);
                ObjectHandler.Serialization(email);

                if (!(email.getSubject().startsWith("Happy Birthday"))) {
                    System.out.println("Email has been sent to " + email.getEmailTo() + " !");
                }

            } catch (MessagingException e) {
                e.printStackTrace();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Invalid email details input format!");
        }
    }

}