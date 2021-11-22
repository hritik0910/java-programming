import java.util.*;

public class functionForVoteAge {

  public static void voteAge(int a) {
    if (a >= 18) {
      System.out.println("The person is eligible for voting");
    } else {
      System.out.println("The person is not eligible for voting");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    voteAge(a);
  }
}
