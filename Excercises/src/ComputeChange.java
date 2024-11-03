import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args) {
        Scanner amount = new Scanner(System.in);
        System.out.println("Enter the amount of Money: ");
        double money = amount.nextDouble();
        int cents = (int) (money*100);

        int dollars = cents/100;
        int remainingAmount= cents%100;
        System.out.println("remainingdol"+remainingAmount);

        int quarters = remainingAmount/25;
        remainingAmount = remainingAmount%25;
        System.out.println("remainingquar"+ remainingAmount);

        int dimes = remainingAmount/10;
        remainingAmount = remainingAmount%10;
        System.out.println("remainingdim"+ remainingAmount);

        int nickels = remainingAmount/5;
        System.out.println("remainingnick"+ remainingAmount);
        int pennies = remainingAmount%5;

        if (dollars ==1 )
            System.out.println("You have 1 dollar,");
        else
            System.out.println("You have "+ dollars+ " dollars, ");

        if (quarters ==1 )
            System.out.println("You have 1 quarter,");
        else
            System.out.println("You have "+ quarters+ " quarters, ");
        if (dimes ==1 )
            System.out.println("You have 1 dime,");
        else
            System.out.println("You have "+ dimes+ " dimes,");
        if (nickels ==1 )
            System.out.println("You have 1 nickel,");
        else
            System.out.println("You have "+ nickels+ " nickels,");
        if (pennies ==1 )
            System.out.println("You have 1 penny.");
        else
            System.out.println("You have "+ pennies+ " pennies.");
    }
}
