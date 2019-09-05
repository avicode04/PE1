import java.util.*;

public class pe16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(isCapital(c)){
            System.out.println("Capital Letter");
        }
        else if(isSmall(c)){
            System.out.println("Small Letter");
        }
        else if(isDigit(c)){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }

    static boolean isCapital(char c){
        if(c<='Z' && c>='A')
            return true;
        return false;
    }

    static boolean isSmall(char c){
        if(c<='z' && c>='a')
            return true;
        return false;
    }

    static boolean isDigit(char c){
        if(c<='9' && c>='0')
            return true;
        return false;
    }
}