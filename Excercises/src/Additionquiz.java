import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Scanner;
public class Additionquiz {
    public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
        int a = random.nextInt(0,10) ;
        int b = random.nextInt(0,10);
        int c = random.nextInt(0,10);

        System.out.println( " Multiply the 3 numbers: "+a+","+b+","+c);
        System.out.println("Answer: "); int x = scanner.nextInt();
        if (x==(a*b*c))
            System.out.println("your answer is correct!");
        else
            System.out.println("Wrong! The answer is: "+a*b*c);

    }
}
