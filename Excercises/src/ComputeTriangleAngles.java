import java.util.Scanner;

public class ComputeTriangleAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates as x1,y1;x2,y2;x3,y3");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double SideA= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double SideB= Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
        double SideC= Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));

        double A = Math.toDegrees(Math.acos((SideA*SideA - SideB*SideB - SideC*SideC)/(-2*SideB*SideC)));
        double B = Math.toDegrees(Math.acos((SideB*SideB - SideA*SideA - SideC*SideC)/(-2*SideA*SideC)));
        double C = Math.toDegrees(Math.acos((SideC*SideC - SideB*SideB - SideA*SideA )/(-2*SideA*SideB)));
        System.out.println(A);
        System.out.println("The three angles are "+ Math.round(A*100)/100.0+" "+Math.round(B*100)/100.0+" "+Math.round(C*100)/100.0);
    }
}
