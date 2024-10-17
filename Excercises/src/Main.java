public class Main {
    public static void main(String[] args) {
        System.out.println("a\t\ta^2\t\ta^3");
        for (int a = 1; a <= 4; a++) {
            int aSquared = a * a;
            int aCubed = a * a * a;
            System.out.println(a + "\t\t" + aSquared + "\t\t" + aCubed);
        }
    }
}