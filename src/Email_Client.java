// 200384G

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Email_Client {

    public static void main(String[] args) throws ParseException, IOException {
        ClientDataLoader.loader();

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    Enter option type:\s
                    1 - Adding a new recipient
                    2 - Sending an email
                    3 - Printing out all the recipients who have birthdays
                    4 - Printing out details of all the emails sent
                    5 - Printing out the number of recipient objects in the application
                    6 - Close email client""");


            int option = Integer.parseInt(scanner.nextLine());
            String input;


            switch (option) {
                case 1 -> {
                    System.out.println("INPUT FORMAT -\nOfficial:Nima,nimal@gmail.com,ceo\nOffice_friend: kamal,kamal@gmail.com,clerk,2000/12/12\nPersonal: sunil,<nick-name>,sunil@gmail.com,2000/10/10");
                    input = scanner.nextLine();
                    AddRecipient.create(input);
                }
                case 2 -> {
                    System.out.println("INPUT FORMAT - email, subject, content");
                    input = scanner.nextLine();
                    SendEmail.SendEmail(input);

                }
                case 3 -> {
                    System.out.println("INPUT FORMAT - yyyy/MM/dd (ex: 2018/09/17)");
                    input = scanner.nextLine();
                    BirthdaysOnDay.CheckBirthdayClients(input);
                }
                case 4 -> {
                    System.out.println("INPUT FORMAT - yyyy/MM/dd (ex: 2018/09/17)");
                    input = scanner.nextLine();
                    EmailsOnGivenDate.emails_sent(input);
                }
                case 5 -> System.out.println("The number of recipients are : " + Recipients.getRecipient_count());
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid input.");
            }
            System.out.println("\n");


        }
    }
}

