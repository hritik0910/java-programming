import java.util.*;

public class functionToFindPrime {

  public static void primeNo(int a) {
    boolean flag = true;
    for (int i = 2; i < a; i++) {
      if (a % i == 0) {
        flag = false;
        break;
      }
    }
    if (flag == true) {
      System.out.println("The no. is prime");
    } else {
      System.out.println("The no. is not prime");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    primeNo(n);
  }
}
