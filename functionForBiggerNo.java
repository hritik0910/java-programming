import java.util.*;

public class functionForBiggerNo {

  public static void BiggerNo(int a, int b) {
    if (a > b) {
      System.out.println("a is a bigger no.");
    } else if (a == b) {
      System.out.println("both the numbers are equal");
    } else {
      System.out.println("b is bigger than a ");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    BiggerNo(a, b);
  }
}
