import java.util.*;


public class arraySorting {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] num = new int[a];
    for (int i = 0; i < a; i++) {
      num[i] = sc.nextInt();
    }

    for (int i = 0; i < a; i++) {
      System.out.println(num[i]);
    }
    Arrays.sort(num);
    System.out.println("sorted list is");

    for (int i = 0; i < a; i++) {
      System.out.println(num[i]);
    }
  }
}
