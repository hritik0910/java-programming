import java.util.*;
public class Month {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numeric no. of a month");
        int a = sc.nextInt();
        switch(a){
            case 1: System.out.println("january");
            break;
            case 2: System.out.println("feb");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("june");
            break;
            case 7: System.out.println("july");
            break;
            case 8: System.out.println("august");
            break;
            case 9: System.out.println("september");
            break;
            case 10: System.out.println("october");
            break;
            case 11: System.out.println("november");
            break;
            case 12: System.out.println("december");
            break;
            default: System.out.println("invalid input");
        }
    }
}