import java.util.*;
public class pe11{
    public static void main(String args[]){
        int x,y=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        x = sc.nextInt();
        for(int i=x;i>0;i/=10){
            y*=10;
            y+=i%10;
            
        }
        System.out.println(y);
        if(y==x){
            System.out.println(x + " is a Palindrome");
        }

        while(y>0){
            if(((y%10)&1)==0) 
                sum+=y%10;
            y/=10;
        }

        if(sum>25){
            System.out.println("and Sum is more than 25");
        }
        else 
            System.out.println("and Sum is less than 25");
    }
}