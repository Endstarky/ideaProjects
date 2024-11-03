import java.util.Scanner;

public class computecircle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Provide the radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Perimeter or Area?");
        String store= scanner.nextLine();

        if (store.equalsIgnoreCase("Perimeter")){
            double perimeter= 2 * radius* Math.PI;
            System.out.println(perimeter);
        }
        else {
            System.out.println(radius*radius*Math.PI);
        }
    }
}
