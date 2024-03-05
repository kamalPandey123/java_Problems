
//program to shift the given character at the end of string using recursion
import java.util.*;

public class shiftCurrentVarible {

    public static String shiftChar(int i, String str, String new_1, String new_2, char c) {
        if (i == str.length() - 1) {
            return new_1 + new_2;
        }

        if (str.charAt(i) != c) {

            new_1 = new_1 + str.charAt(i);
            i++;
        } else {
            if (str.charAt(i) == c)
                new_2 = new_2 + str.charAt(i);
            i++;

        }
        return shiftChar(i, str, new_1, new_2, c);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        System.out.println("Enter the character:");
        char c = sc.next().charAt(0);
        System.out.print(shiftChar(0, str, "", "", c));

    }
}
