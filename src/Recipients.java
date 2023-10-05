import java.io.File;
import java.util.Scanner;

// class to represent a recipient
public abstract class Recipients {
    protected String name, email;
    public static int recipient_count = findInitialRecipientCount();

    public Recipients(String name, String email) {
        this.name = name;
        this.email = email;

        recipient_count += 1;
    }

    public static int getRecipient_count() {
        return recipient_count;
    }

    public static int findInitialRecipientCount() {
        int count = 0;

        try {
            File file = new File("clientList.txt");

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }

            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return count;
    }
}
