import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// class to load client details from the text file
public class ClientDataLoader {

    public static List<String[]> ClientDetailsList = new ArrayList<>();

    public static void loader() throws IOException {
        File file = new File("clientList.txt");

        if(!(file.exists() && !file.isDirectory())){
            file.createNewFile();
        }


        BufferedReader bf = new BufferedReader(new FileReader("clientList.txt"));

        String line = bf.readLine();

        while (line != null) {
            String[] recipient_Data_2 = line.split(":");
            String[] sub_recipientData_2 = recipient_Data_2[1].split(",");
            String recipient_type_2 = recipient_Data_2[0];
            int length = sub_recipientData_2.length + 1;
            String[] new_rec_data = new String[length];
            new_rec_data[0] = recipient_type_2;
            System.arraycopy(sub_recipientData_2, 0, new_rec_data, 1, length - 1);

            ClientDetailsList.add(new_rec_data);
            line = bf.readLine();

        }
        bf.close();

        BirthdayEmailSender.BirthdayEmail(ClientDetailsList);
    }


}
