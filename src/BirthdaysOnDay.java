// class which displays birthdays on the entered date

public class BirthdaysOnDay {

    // method which checks who has birthdays on the input date
    public static void CheckBirthdayClients(String input) {
        int count = 0;
        if (input.length() < 10) {
            System.out.println("Invalid Date.");
            return;
        }
        for (int i = 0; i < ClientDataLoader.ClientDetailsList.size(); i++) {
            String[] details = (ClientDataLoader.ClientDetailsList.get(i));
            if ((details[0].equalsIgnoreCase("Office_friend") || details[0].equalsIgnoreCase("Personal"))) {
                if (input.substring(5, 10).equalsIgnoreCase(details[4].substring(5, 10))) {
                    System.out.print(details[1] + "\n" );
                    count++;
                }
            }

        }
        if (count == 0) {
            System.out.println("No birthdays on the " + input + ".");
        }

    }
}
