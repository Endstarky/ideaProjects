import java.time.Month;
import java.time.chrono.Chronology;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.Year;

import java.time.Month;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month: ");
        int month = scanner.nextInt();
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        Year year1 = Year.of(year);
        boolean isLeap = year1.isLeap();
        Month monthName= Month.of(month);
        int daysInMonth = monthName.length(isLeap);
        System.out.println(daysInMonth);


    }
}
