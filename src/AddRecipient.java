import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;


//class which creates an object for each recipient
public class AddRecipient {

    //method which creates an object for each recipient
    public static void create(String input) throws ParseException {
        try {
            String[] recipient_Data = input.split(":");
            String[] sub_recipientData = recipient_Data[1].split(",");
            String recipient_type = recipient_Data[0];

            if (recipient_type.equalsIgnoreCase("Official")) {
                Recipients OfficialRecipient = new Official_Recipients(sub_recipientData[0].strip(), sub_recipientData[1].strip(), sub_recipientData[2].strip());
            } else if (recipient_type.equalsIgnoreCase("Office_friend")) {
                Recipients CloseOfficialRecipient = new Close_Official_Recipients(sub_recipientData[0].strip(), sub_recipientData[1].strip(), sub_recipientData[2].strip(), sub_recipientData[3].strip());

            } else if (recipient_type.equalsIgnoreCase("Personal")) {
                Recipients Personal_Recipient = new Personal_Recipients(sub_recipientData[0].strip(), sub_recipientData[1].strip(), sub_recipientData[2].strip(), sub_recipientData[3].strip());

            } else
                System.out.println("Invalid Recipient Type.");



            FileWriter myWriter = new FileWriter("clientList.txt", true);

            myWriter.write(input + "\n");
            myWriter.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Invalid Recipient Details Input !");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

            System.out.println("Recipient Added Successfully");

    }


}
