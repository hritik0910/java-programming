import java.util.*;
public class loop_hello_world{
    public static void main(String args[]){
        System.out.println("Enter how much time you want to print hello world");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Hello World");
        }
    }
}