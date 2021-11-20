import java.util.*;

public class functionOfTable {

  public static void Table(int a) {
    for (int i = 1; i <= 10; i++) {
      int mul = a * i;
      System.out.println(a + "x " + i + "= " + mul);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    Table(a);
  }
}
