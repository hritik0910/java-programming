import java.util.*;
public class findANumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in arrays");   
        int a  = sc.nextInt();
        int number[] =new int[a];
        for (int  i = 0;i<a;i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to find");
        int b = sc.nextInt();
        for (int i  = 0;i < a;i++) {
            int c = number[i]; 
            if( c==b) {
                System.out.println("the index is");
                System.out.println(i);
                break;
            }
          
        }
    }
}
