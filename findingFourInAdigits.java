import java.util.*;
public class findingFourInAdigits {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        for (int i= 0;i<a;i++){
            int c = sc.nextInt();
            int count1 = 0;
            if (c>=0 && c<=9){
                if (c==4){
                    count1++;
                }
                }
            else{
                
                while (c>0) {
                int rem = c%10;
                if (rem==4){
                    count1++;
                }
                c=c/10;
                
                }
            }
            System.out.println(count1);
            
        }
    } 
}
