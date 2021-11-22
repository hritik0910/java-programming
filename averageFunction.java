import java.util.*;

public class averageFunction {

  public static float averageOfThreeNo(float a, float b, float c) {
    float avg = (a + b + c) / 3;
    System.out.println(avg);
    return 0;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float a = sc.nextInt();
    float b = sc.nextInt();
    float c = sc.nextInt();
    averageOfThreeNo(a, b, c);
  }
}
