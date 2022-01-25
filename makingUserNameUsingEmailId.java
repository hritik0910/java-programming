import java.util.*;

public class makingUserNameUsingEmailId {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String userName = "";
    for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i)== '@') { 
            break;
        }
        else{
            userName+=a.charAt(i);
        }

    }
    System.out.println("Th user name is " + userName);  
}
}
