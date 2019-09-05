import java.util.*;

public class pe20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        String repeat = s.substring(s.length()-n);
        // System.out.println(repeat);
        for(int i=0;i<n;i++){
            s+=repeat;
        }
        System.out.println(s);
    }
}