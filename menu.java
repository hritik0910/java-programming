import java.util.*;
public class menu {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a;
        do{
             a = sc.nextInt();
             if(a==1){
                System.out.println("the marks out of 100");
                int marks = sc.nextInt();
         
          if(marks>=90) {
              System.out.println("This is good");
          } 
          else if(marks>=60 && marks<=89) {
              System.out.println("This is also good");
          }
          else if(marks>=0 && marks<=59) {
              System.out.println("This is good as well");
          } 
        }
        else if(a!=0){
            System.out.println("Invalid Input");
        }
        }while(a==1); 
    }
}

