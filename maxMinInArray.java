import java.util.*;

public class maxMinInArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of numbers you want to enter");
    int a = sc.nextInt();
    int number[] = new int[a];
    for (int i = 0; i < a; i++) {
      number[i] = sc.nextInt();
    }
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < a; i++) {
      if (number[i] < min) {
        min = number[i];
      }
      if (number[i] > max) {
        max = number[i];
      }
    }
    System.out.println("The minimum value in a array is" + min);
    System.out.println("The maximum value in a array is" + max);
}
}
