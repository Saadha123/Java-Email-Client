import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// the class to compare the client birthday date with present date
public class CheckDate {

    public static boolean TodayDate(String[] array) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String Current_Month_Day = dtf.format(now);

        String Birthday_Month_Day = array[4].substring(5, 10);

        return Current_Month_Day.equalsIgnoreCase(Birthday_Month_Day);
    }
}
