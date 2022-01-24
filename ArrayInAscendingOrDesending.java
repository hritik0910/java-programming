import java.util.*;

public class ArrayInAscendingOrDesending {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    boolean b = true;
    int number[] = new int[a];
    for(int i=0;i<a;i++){
        number[i]= sc.nextInt();
    }
    for (int j=0;j<number.length-1;j++){
        if (number[j]<number[(j+1)]){
            b = false;
        }
    }
    if (b== true) {
        System.out.println("It is in a sorted order");
    }  
    else{
        System.out.println("It is not sorted in ascending order");
    }

}
}
