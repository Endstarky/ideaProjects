import java.util.ArrayList;
import java.util.List;

public class charcasting {
    public static void main(String[] args) {
        char ch = (char)65.92;
        System.out.println(ch);
        int i = (int)'A';
        System.out.println(i);
        List<Character> list = new ArrayList<>();
        list.add('l');
        list.add('A');
        list.add('B');
        list.add('a');
        list.add('b');
        for (char alphabets:list) {
            char m = alphabets;
            System.out.println((int)m);
        }
        float f = 1000.34f;
        int r = (int)f;
        char x = '\b';
        String s ="sad\fdsd";
        System.out.println(s);
    }
}
