import javax.swing.*;

public class ISBN10_Maker {
    public static void main(String[] args) {
        int d1,d2,d3,d4,d5,d6,d7,d8,d9;
        d1=Integer.parseInt(JOptionPane.showInputDialog("Input the 1st ISBN number : "));
        d2=Integer.parseInt(JOptionPane.showInputDialog("Input the 2nd ISBN number : "));
        d3=Integer.parseInt(JOptionPane.showInputDialog("Input the 3rd ISBN number : "));
        d4=Integer.parseInt(JOptionPane.showInputDialog("Input the 4th ISBN number : "));
        d5=Integer.parseInt(JOptionPane.showInputDialog("Input the 5th ISBN number : "));
        d6=Integer.parseInt(JOptionPane.showInputDialog("Input the 6th ISBN number : "));
        d7=Integer.parseInt(JOptionPane.showInputDialog("Input the 7th ISBN number : "));
        d8=Integer.parseInt(JOptionPane.showInputDialog("Input the 8th ISBN number : "));
        d9=Integer.parseInt(JOptionPane.showInputDialog("Input the 9th ISBN number : "));

        int d10 = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
        JOptionPane.showConfirmDialog(null, "The complete ISBN-10 number for the book is: "+d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+d10);
    }
}
