
// program to revers a string
import java.util.*;

public class reversString {
//  recursive function   
    public static String revers_String(String s, String newString, int i) {

        if (i == 0) {
            newString = newString + s.charAt(i);
            return newString;
        }
        newString = newString + s.charAt(i);// character from index i (i =  string.length - 1) add to newString 
        return revers_String(s, newString, i - 1);

    }

    public static void main(String... args) {
        //Declare object 
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(revers_String(s, "", s.length() - 1));

    }
}
