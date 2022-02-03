import java.util.*;
class NoOfTrailingZeroInFactorial{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n  = sc.nextInt();
            int res=0;
            for (int i=5;i<=n;i=i*5){
                res = res + n/i;
            }
            System.out.println(res);
        }
    }

}