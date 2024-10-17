import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
public class Dayprompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the day number 0-6: ");
        int daynumber = scanner.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.of(daynumber);
        System.out.println(dayOfWeek);

        System.out.println("How many days after the present date: ");
        int elapsed = scanner.nextInt();
        int futureDay= (daynumber+elapsed)%7;
        DayOfWeek FutureDay= DayOfWeek.of(futureDay);

        System.out.println("Present day is " + dayOfWeek + " and the future day is "+FutureDay);
    }
}
