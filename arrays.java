import java.util.*;
public class arrays {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] marks = new int[3];
    System.out.println("Enter marks of physics");
    int a = sc.nextInt();
    System.out.println("Enter marks of maths");
    int b = sc.nextInt();
    System.out.println("Enter marks of english");
    int c = sc.nextInt();
    System.out.println();
    marks[0]= a;
    marks[1]= b;
    marks[2]= c;
    for(int i = 0;i<3;i++){
        System.out.println(marks[i]);
    }

    }
}
