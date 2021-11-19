import java.util.*;
import java.util.Scanner;

public class pattern1 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of rows");
    int a = sc.nextInt();
    System.out.println("Enter no. of coloumn");
    int b = sc.nextInt();
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= b; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
