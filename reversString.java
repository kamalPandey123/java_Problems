
// program to revers a string
import java.util.*;

public class reversString {
    public static String revers_String(String s, String newString, int i) {

        if (i == 0) {
            newString = newString + s.charAt(i);
            return newString;
        }
        newString = newString + s.charAt(i);
        return revers_String(s, newString, i - 1);

    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(revers_String(s, "", s.length() - 1));

    }
}
/*
 * if (index == 0) {
 * System.out.print(s.charAt(index));
 * return;
 * }
 * System.out.print(s.charAt(index));
 * index--;
 * recurString(s, index);
 */