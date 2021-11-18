import java.util.*;
public class table_using_loop {
    public static void main(String args[]) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the no you want to print table");
     int n = sc.nextInt();
     for(int i=1;i<=10;i++) {
       System.out.println(n*i);
     }
    } 
}
