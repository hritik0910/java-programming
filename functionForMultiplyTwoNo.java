import java.util.*;

public class functionForMultiplyTwoNo {

  public static int multiply(int a, int b) {
    int mul = a * b;
    return mul;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int mul = multiply(a, b);
    System.out.println("The product of two no. is " + mul);
  }
}
