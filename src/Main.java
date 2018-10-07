import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String go = repeatString("go", 3);
        String xxx = repeatString("xxx", 0);
        System.out.println(go);
        System.out.println(xxx);

        String go2 = padLeft("go", 5);
        System.out.println(go2);

        String go3 = padRight("go",5);
        System.out.println(go3);

        System.out.println(numbersRange(3,8));

    }

    /** This method Repeats a String n times */
    private static String repeatString(String s, int number) {

        String result = "";

        for (int i = 1; i <= number; i++) {
            result += s;
        }
        return result;
    }

    private static String padLeft(String s, int number) {

        int lenght = s.length();

        return repeatString(" ",number - lenght) + s;

    }

    private static String padRight(String s, int number) {

        int lenght = s.length();

        return s + repeatString(" ", number - lenght);
    }

    private static List<Integer> numbersRange (int a, int b) {

        List<Integer> numbersRange = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            numbersRange.add(i);

        }
        return numbersRange;
    }

}
