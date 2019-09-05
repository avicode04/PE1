import java.util.*;

public class pe12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        if(x<=30 && x>=20){
            if(x%2==0){
                System.out.println("Jerry");
            }
            else{
                System.out.println("Tom");
            }
        }
    }
}