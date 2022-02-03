import java.util.*;
public class pallindromeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a  = sc.nextInt();
            int b = a;
            int rev=0;
            while (b>0){
                int rem = b%10;
                rev=rev*10+rem;
                b = b/10;
            }
            System.out.println("the Reverse number is:"+rev);
            if (rev==a){
                System.out.println("pallindrome number");
            }
            else{
                System.out.println("not a pallindrome number");
            }
        }
    }
}
