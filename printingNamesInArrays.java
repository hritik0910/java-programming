import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class printingNamesInArrays {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number of names you want to store in array");
        int a = sc.nextInt();
        String names[] = new String[a];
        for(int i = 0; i<a;i++){
            names[i] = sc.next();
        }
        for(int i = 0;i<names.length;i++){
            System.out.println("the"+' '+(i+1)+" "+"name is "+names[i]);

        }
    }
}
