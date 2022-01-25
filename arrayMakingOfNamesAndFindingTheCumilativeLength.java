import java.util.*;
public class arrayMakingOfNamesAndFindingTheCumilativeLength {
        public static void main(String args[]) {
            Scanner d  = new Scanner(System.in);
            int a  =  d.nextInt();
            String arr[] = new String[a];
            for (int i = 0;i<a;i++){
                arr[i] = d.next();

            }
            int length = 0;
            for (int j = 0;j<a;j++){
                length  = length+arr[j].length(); 
            }
            System.out.println("The length of the arr is "+ length);
        }
}
