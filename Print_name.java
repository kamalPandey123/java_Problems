import java.util.Scanner;

//if string is Krishna Radha so output will be K.Radha
public class Print_name {
    public static int LengthOfLastWord(String s) {
        int i;
        int len = s.length() - 1;
        for (i = len; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
        }
        return i;

    }

    public static String RequiredString(String s, String newString, int len) {

        int i = 0;

        newString = newString + Character.toUpperCase(s.charAt(0));
        newString = newString + '.';
        while (i <= len) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' && i < len) {
                newString = newString + Character.toUpperCase(s.charAt(i + 1));
                newString = newString + '.';
            }

            i++;
        }
        return newString;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = LengthOfLastWord(s);
        String s1 = RequiredString(s, "", len);
        // System.out.println(s1);
        s1 = s1 + Character.toUpperCase(s.charAt(len + 1));
        len += 2;
        while (len < s.length()) {
            s1 = s1 + s.charAt(len++);
        }
        System.out.println(s1);

    }

}
