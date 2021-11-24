import java.util.*;

public class count {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    char b;
    do {
      int a = sc.nextInt();
      if (a > 0) {
        c1++;
      } else if (a < 0) {
        c2++;
      }  else{
        c3++;
      } 
      System.out.println("do you want to continue y or n");  
      b= sc.next().charAt(0);
      
    } while (b=='y' || b=='Y');
    System.out.println("positive no. = "+c1);
    System.out.println("negative no. = "+c2);
    System.out.println("typed zero = "+c3);
  
}
}