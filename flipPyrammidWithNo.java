import java.util.*;

public class flipPyrammidWithNo {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 1;
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(a);
      }
      a++;
      System.out.println();
    }
  }
}
