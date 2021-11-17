import java.util.*;
public class condition1 {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if (age > 18) {
        System.out.println("He is adult");
    } else{
        System.out.println("he is minor");
    }
    }
}