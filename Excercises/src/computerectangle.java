import javax.swing.JOptionPane;
import java.util.Scanner;
public class computerectangle {
    public static void main(String[] args) {
        String data= JOptionPane.showInputDialog("Perimeter or area of a rectangle?: ");
        double length= Double.parseDouble(JOptionPane.showInputDialog("give the length: "));
        double width= Double.parseDouble(JOptionPane.showInputDialog("Give the Width: "));

        if (data.equalsIgnoreCase("Perimeter")){
            JOptionPane.showMessageDialog(null,"Perimeter is "+ 2*(length+width)+ " units");
        }
        else{
            JOptionPane.showMessageDialog(null,"Area is "+ length*width+" units^2");
        }
    }
}
