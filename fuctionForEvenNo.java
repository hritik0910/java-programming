import java.util.*;

public class fuctionForEvenNo {

  public static void EvenNo(int a) {
    if (a % 2 == 0) {
      System.out.println("It is  a even no.");
    } else {
      System.out.println("Its is  a odd no.");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    EvenNo(a);
  }
}
