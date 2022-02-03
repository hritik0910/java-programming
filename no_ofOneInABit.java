import java.util.*;

public class no_ofOneInABit {

  public static int  SetBits(long a) {
    Scanner sc = new Scanner(System.in);
    int count1 = 0;
    while (a != 0) {
      a = a & (a - 1);
      count1++;
    }
    return count1;
  }

 
  }

