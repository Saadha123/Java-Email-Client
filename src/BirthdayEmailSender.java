import java.util.List;

// the class which finds the clients having their birthdays
public class BirthdayEmailSender {
//
    public static void BirthdayEmail(List<String[]> ClientDetailsList) {

        System.out.println("Sending Birthday emails....");
        for (String[] sub_list : ClientDetailsList) {
            if (sub_list[0].equalsIgnoreCase("Office_friend") || sub_list[0].equalsIgnoreCase("Personal")) {
                boolean x = CheckDate.TodayDate(sub_list);
                if (x) {
                    BirthdayEmail.SendBirthdayEmail(sub_list);
                }
            }
        }

        System.out.println("All birthday emails have been sent.");
    }
}
