
// class to represent close official recipients
public class Close_Official_Recipients extends Recipients {

    protected String designation, Birthday_Date;

    public Close_Official_Recipients(String name, String email, String designation, String Birthday_Date) {
        super(name, email);
        this.designation = designation;
        this.Birthday_Date = Birthday_Date;

    }

    //deciding birthday message
    public static void SendOfficeFriendEmail(String[] array) {
        String emailId = array[2];
        String emailSubject = "Happy Birthday " + array[1] + "!";
        String message = "Wish you a Happy Birthday. \n Saadha. ";
        String Email_input = emailId + ", " + emailSubject + ", " + message;
        SendEmail.SendEmail(Email_input);
    }
}
