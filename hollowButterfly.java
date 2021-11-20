import java.util.*;

public class hollowButterfly {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if (i == 1 || j == 1 || j == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      int space = 2 * (n - i);
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        if (i == 1 || j == 1 || j == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      int space = 2 * (n - i);
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
