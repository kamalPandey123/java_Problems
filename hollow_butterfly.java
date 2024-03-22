
/*
 * Advance pattern
 * 
 *     *                    *
 *     *   *            *   *
 *     *       *      *     *
 *     *          **        *
 *     *       *      *     *
 *     *   *            *   *
 *     *                    *
 */

import java.util.*;

public class hollow_butterfly {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Size of pattern:");
    int size = sc.nextInt();
    for (int i = 0; i < size; i++) {

      for (int j = 0; j < 1; j++) {

        if (i == 0) {

          System.out.print("* ");

        } else {

          System.out.print("* ");

          for (int k = 0; k < i; k++) {

            System.out.print("  ");
          }

          System.out.print("*");

        }

      }
      for (int j = 0; j < 1; j++) {

        for (int k = size - 1; k > i; k--) {

          System.out.print("  ");
        }
        for (int k = size - 1; k > i; k--) {

          System.out.print("  ");

        }
        if (i == 0) {

          System.out.print("  *");

        } else {

          System.out.print("*");
          for (int k = 0; k < i; k++) {

            System.out.print("  ");

          }

          System.out.print("* ");

        }

        System.out.println();
      }
    }

    for (int i = 0; i < size; i++) {

      for (int j = 0; j < 1; j++) {

        if (i == size - 1) {

          System.out.print("*  ");

        } else {

          System.out.print("* ");
          for (int k = size - 1; k > i; k--) {

            System.out.print(" ");
          }
          for (int k = size - 1; k > i; k--) {

            System.out.print(" ");

          }

          System.out.print("*");
        }

      }
      for (int j = 0; j < i; j++) {

        System.out.print("  ");
      }
      for (int j = 0; j < i; j++) {

        System.out.print("  ");
      }
      for (int j = 0; j < 1; j++) {

        if (i == size - 1) {

          System.out.print(" *");
        } else {

          System.out.print("*");
          for (int k = size - 1; k > i; k--) {

            System.out.print("  ");
          }

          System.out.print("*");
        }

      }
      System.out.println();

    }
  }
}