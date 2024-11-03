public class experimental_class {
    public static void main(String[] args) {
        String s1 = "New York";
        String s2 = "abg";
        String s3 = "Boston";
        int i =s1.compareTo(s2); // is 0
        int j =s1.compareTo(s3); // is -16
        int k =s3.compareTo(s1); // is 16
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

    }
}
