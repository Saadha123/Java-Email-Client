import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class ObjectHandler {

    static String filename = "email.ser";

    // serializing the email
    public static void Serialization(Email email) {
        boolean exists = Files.exists(Path.of(filename));
        try {
            FileOutputStream file = new FileOutputStream(filename, true);
            ObjectOutputStream out;
            if (exists) {
                out = new ObjectOutputStream(file) {
                    @Override
                    protected void writeStreamHeader() {
                    }
                };
            } else {
                out = new ObjectOutputStream(file);
            }
            out.writeObject(email);
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // deserializing the email
    public static ArrayList Deserialization() {
        ArrayList<Email> emails_sent = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream input = new ObjectInputStream(fis);
            Email obj = (Email) input.readObject();
            while (obj != null) {
                emails_sent.add(obj);
                try {
                    obj = (Email) input.readObject();
                } catch (EOFException ee) {
                    break;
                }
            }
            fis.close();
            input.close();
        } catch (Exception e) {
            //System.out.println(e.printStackTrace());
        }

        return emails_sent;


    }

}


