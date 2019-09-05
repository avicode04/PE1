

import java.util.*;

public class pe15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,sum=0;
        while(true){
            x = sc.nextInt();
            if(x==0)
                break;
            sum+=x;
            
        }
        System.out.println(sum);
    }
}