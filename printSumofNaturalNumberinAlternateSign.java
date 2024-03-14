
//print sum in with Alternate sign ex = 1-2+3-4+5-6+7 = 4
import java.util.Scanner;

public class printSumofNaturalNumberinAlternateSign {

    public static int sumWithalternateSign(int size, int start, int count, int sum) {
        if (count == size + 1)
            return sum;

        if (count % 2 == 0) {
            sum = sum - start;
            count++;
            start++;
            return sumWithalternateSign(size, start, count, sum);

        } else {

            sum = sum + start;
            count++;
            start++;
            return sumWithalternateSign(size, start, count, sum);

        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println(sumWithalternateSign(size, 1, 1, 0));

    }
}
