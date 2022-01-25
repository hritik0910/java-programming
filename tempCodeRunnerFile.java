import java.util.*;

public class name{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        for (int i = 0;i<a;i++){
            String ch = sc.next();
            if ((ch=="b") || (ch=="B")){
                System.out.println("BattleShip");
            }
            else if ((ch=="C") || (ch=="c")){
                System.out.println("Cruiser");
            }
            else if((ch=='d') || (ch=="D")){
                System.out.println("Destroyer");
            }
                
            
    }
}
}