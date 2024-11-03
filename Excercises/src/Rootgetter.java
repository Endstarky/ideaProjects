import java.util.Scanner;
import java.math.*;
public class Rootgetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of a: ");
        int a = scanner.nextInt();
        System.out.println("Value of b: ");
        int b = scanner.nextInt();
        System.out.println("Value of c: ");
        int c = scanner.nextInt();

        double x = Math.sqrt(Math.pow(b,2)-(4*a*c));
        System.out.println(x);
        double root1= (-b+x)/(2*a);
        double root2= (-b-x)/(2*a);
        System.out.println("Root1 is: "+root1+" and Root2 is: "+root2);
    }
}
