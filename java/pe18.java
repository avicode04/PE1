import java.util.*;

public class pe18{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = 31,y;
        boolean b = true;
        System.out.println("Guess a number from 1-50");
        while(b){
            
            y = sc.nextInt();
            if(y==x){
                System.out.println("Number guessed matches the original number");
                b=false;
            }
            else if(y<x){
                System.out.println("Number guessed is less than original number");
            }
            else{
                System.out.println("Number guessed is more than original number");
            }
        }
    }
}