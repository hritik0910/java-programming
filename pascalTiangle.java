import java.util.*;

public class pascalTiangle {
    public static void main(String Args[]){
    Scanner sc =new Scanner(System.in);
    int c=0;
    int n = sc.nextInt();
    for (int i = 1;i>=n;i++){
       for(int j =1;j<=i;j++){
            System.out.print(" ");        
           }
        for (int j = 1;j<=i;j++) {
           if(j==0){
             c = 1;
           }
           else{
             c = (c*(i-j+1))/j;
           }
           System.out.print(c);
        }
    System.out.println();
    }
    }
    
}
