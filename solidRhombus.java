import java.util.*;

public class solidRhombus {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
