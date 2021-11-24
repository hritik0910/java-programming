import java.util.*;

public class functionForCircumferenceOfTriangle {

  public static void circumferenceOfTriangle(float a) {
    float b = (22f / 7) * (2) * a;
    System.out.println(b);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    circumferenceOfTriangle(a);
  }
}
