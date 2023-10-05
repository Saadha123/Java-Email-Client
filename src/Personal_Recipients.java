
// class to represent personal recipients
public class Personal_Recipients extends Recipients {

    protected String nickname, Birthday_Date;

    public Personal_Recipients(String name, String nickname, String email, String Birthday_Date) {
        super(name, email);
        this.nickname = nickname;
        this.Birthday_Date = Birthday_Date;
    }


    // deciding the birthday message
    public static void SendCloseFriendEmail(String[] array) {
        String emailId = array[3];
        String emailSubject = "Happy Birthday " + array[2] + "!";
        String message = "Hugs and love on your birthday. \n Saadha ";
        String Email_input = emailId + ", " + emailSubject + ", " + message;
        SendEmail.SendEmail(Email_input);
    }
}