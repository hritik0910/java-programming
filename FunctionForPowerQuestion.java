import java.util.*;

public class FunctionForPowerQuestion {

  public static void PowerFunction(int x, int y) {
    System.out.println(Math.pow(x, y));

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    PowerFunction(a, b);
  }
}
