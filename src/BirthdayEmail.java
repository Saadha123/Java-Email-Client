//The class which decides the birthday email contents
public class BirthdayEmail {

    // method which filters whom to send birthday details to
    public static void SendBirthdayEmail(String[] BirthdayClientDetails) {

        if (BirthdayClientDetails[0].equalsIgnoreCase("Office_friend")) {
            Close_Official_Recipients.SendOfficeFriendEmail(BirthdayClientDetails);

        }

        if (BirthdayClientDetails[0].equalsIgnoreCase("Personal")) {
            Personal_Recipients.SendCloseFriendEmail(BirthdayClientDetails);

        }

    }
}
