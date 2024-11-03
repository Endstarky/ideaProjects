import javax.swing.JOptionPane;
public class Linearequation {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("value of a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("value of b: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("value of c: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog("value of d: "));
        int e = Integer.parseInt(JOptionPane.showInputDialog("value of e: "));
        int f = Integer.parseInt(JOptionPane.showInputDialog("value of f: "));

        int xd = (a*d)-(b*c);
        int xn1 = (e*d)-(b*f);
        int xn2 = (a*f)-(e*c);

        if (xd==0)
            System.out.println("The equation cannot happen because (ad-bc) is 0.");
        else {
             int s1 = xn1/xd;
             int s2 = xn2/xd;
             System.out.println("so the solutions are "+s1+" & "+s2);
         }

    }
}
