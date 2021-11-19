import java.util.*;

public class Prime {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    boolean flag = true;
    if (a % a == 0) {
      for (int i = 2; i <= a - 1; i++) {
        if (a % i == 0) {
          flag = false;
          break;
        } else {}
      }
    }
    if (flag == true) {
      System.out.println("it is prime");
    } else {
      System.out.println("it is not prime");
    }
  }
}
