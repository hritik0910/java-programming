import java.util.*;
import javax.crypto.AEADBadTagException;

public class functionForAddingTwoNo {

  public static int sum(int a, int b) {
    int add = a + b;
    return add;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter first no");
    int d = sc.nextInt();
    System.out.println("Enter second no.");
    int e = sc.nextInt();
    int add = sum(d, e);
    System.out.println("the sum of two no. is " + add);
  }
}
