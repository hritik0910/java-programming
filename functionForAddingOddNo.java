import java.util.*;

public class functionForAddingOddNo {

  public static void addingOddNo(int a) {
    int count = 0;
    for (int i = 1; i <= a; i++) {
      if (i % 2 != 0) {
        count = count + i;
      } else {}
    }
    System.out.println(count);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    addingOddNo(a);
  }
}
