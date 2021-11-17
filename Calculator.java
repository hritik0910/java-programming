import java.util.*;

public class Calculator {
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter two no.");
  int a = sc.nextInt();
  int b = sc.nextInt();
  System.out.println("FOR ADDITION TYPE 1 \n FOR SUBSTRACTION TPE 2 \n FOR MULTIPLICATION TYPE 3 \n FOR DIVISON TYPE 4  \n FOR modulo or Remainder type 5");  
  int c = sc.nextInt();
  switch(c){
      case 1: System.out.println(a+b);
      break;
      case 2: System.out.println(a-b);
      break;
      case 3: System.out.println(a*b);
      break;
      case 4:System.out.println(a/b);
      break;
      case 5: System.out.println(a%b);
      break;
      default: System.out.println("wrong input");
  }
}

}
