
// program to remove duplicate element from string using recursion
import java.util.*;

public class remove_duplicate {
    public static String newString(String str, String new_String, int i, int value) {
        if (i == str.length() - 1)
            return new_String;
        if (str.isEmpty())
            new_String = new_String + str.charAt(i);

        else {
            for (int j = 0; j <= new_String.length() - 1; j++) {
                if (new_String.charAt(j) == str.charAt(i)) {
                    value = 0;
                    break;
                }
            }
            if (value == 1)
                new_String = new_String + str.charAt(i);

            if (value == 0)
                value = 1;
        }
        i++;
        return newString(str, new_String, i, value);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(newString(s, "", 0, 1));
        sc.close();
    }
}