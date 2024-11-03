import javax.swing.*;
import java.time.Month;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;

public class fitness_tracker {
    public static void main(String[] args) {
        /*Fitness Tracker
    Develop a program to track fitness activities. The program should:

    Use an array to store the number of steps taken each day for a month.
    Allow the user to input the number of steps for each day.
    Calculate the total number of steps taken in the month.
    Find the day with the highest and lowest number of steps.
    Use a while loop to update the number of steps for each day. */

        int GetYear = (new Date().getYear())+1900;
        System.out.println(GetYear );

        ArrayList<String>leapYear = new ArrayList<>();
        String getMonthString=JOptionPane.showInputDialog("For which month do you want to input the data?");
        Month getmonth= Month.valueOf(getMonthString.toUpperCase());
        int getmonthInt= getmonth.getValue();
        System.out.println(getmonthInt);
        int daysinmonth;
        int month = (new Date().getMonth())+1;
        System.out.println(month);
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            daysinmonth = 31;
        }
        if (month==4||month==6||month==9||month==11){
            daysinmonth = 30;
        }
        if ((month==2)||(GetYear%4==0)){
            daysinmonth=29;
        }

    else {
            daysinmonth=28;
        }
        leapYear.add(getMonthString);
        System.out.println(daysinmonth);
        System.out.println(leapYear.get(0));

        for (int i = 1;i<=daysinmonth;i++){
            leapYear.add(JOptionPane.showInputDialog("How many steps for day "+i+" ?"));
        }
        System.out.println(leapYear);
        ArrayList<Integer>sorting = new ArrayList<>();
        for (int i=1; i<=daysinmonth;i++){
            sorting.add(Integer.valueOf((leapYear.get(i))));
        }
        int greatest = Integer.MIN_VALUE;
        for (int element:sorting){
            if (element>greatest){
                greatest=element;
            }
        }
        System.out.println(greatest);
        System.out.println(leapYear.indexOf(String.valueOf(greatest)));
        int summationconfirmation=JOptionPane.showConfirmDialog(null, "Do you want to get the total number of steps for the last month? ");
        if (summationconfirmation==JOptionPane.YES_OPTION){
            int elementfinal = 0;
            for(int i=1; i<=daysinmonth;i++){
                int element= Integer.parseInt(leapYear.get(i));
                elementfinal=elementfinal+element;
            }
            System.out.println(elementfinal);
        }



    }
}
