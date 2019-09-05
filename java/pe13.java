
import java.util.*;
public class pe13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // System.out.println(s);
        if(notLetter(s)){
            System.out.println("Error:only letters allowed");
            return ;
        }
        for(int i=0;i<s.length();i++){
            // System.out.print(s[i]);
            char ch = s.charAt(i);
            // System.out.print(ch);
            if(isVowel(ch)){
                System.out.print("Vowel ");
            }
            else{
                System.out.print("Consonant ");
            }
        }
    }
    public static boolean isVowel(char ch){
        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
            return true;
        return false;
    }

    public static boolean notLetter(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>'z' || s.charAt(i)<'a'){
                return true;
            }
            
        }
        return false;
    }
}