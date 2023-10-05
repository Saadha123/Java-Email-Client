import java.util.ArrayList;

public class EmailsOnGivenDate {
    public static void emails_sent(String date) {
        ArrayList<Email> array_of_emails;

        array_of_emails = ObjectHandler.Deserialization();

        int count = 0;

        for (Email email : array_of_emails) {
            if ((email.date).equalsIgnoreCase(date)) {
                System.out.println("recipient: " + email.emailTo);
                System.out.println("Subject: " + email.subject + "\n");

                count++;
            }
        }

        if (count == 0) {
            System.out.println("No emails were sent on :" + date);
        }


    }
}
