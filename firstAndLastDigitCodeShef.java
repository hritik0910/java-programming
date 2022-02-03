import java.util.*;

class firstAndLastDigitCodeShef {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for (int i = 0; i < a; i++) {
      int n = sc.nextInt();
      String b = Integer.toString(n);
      int length = b.length();

      int c = b.charAt(length - 1) - '0';
      int d = b.charAt(0) - '0';
      System.out.println(c + d);
    }
  }
}
