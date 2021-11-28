import java.util.*;

public class arrayMaxMin {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] num = new int[a];
    for (int i = 0; i < a; i++) {
      num[i] = sc.nextInt();
    }
    //Arrays.sort(num);
    //System.out.println("the minimum value in array is" + num[0]);
    //System.out.println("the max value in array is" + num[a - 1]);
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < num.length; i++) {
      if (num[i] < min) {
        min = num[i];
      }
      if (num[i] > max) {
        max = num[i];
      }
    }
    System.out.println("the min value is " + min);
    System.out.println("the max value is " + max);
  }
}
