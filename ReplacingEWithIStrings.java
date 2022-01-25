import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class ReplacingEWithIStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        for (int i = 0;i<a.length();i++){
        
            if (a.charAt(i)=='e'){
                b+='i';
            }
            else{
                b+=a.charAt(i);
            }
        }
        System.out.println(b);
    }
}
