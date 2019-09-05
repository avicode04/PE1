import java.util.*;

public class pe17{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),sum=0,esum=0;
        int []count = new int[10];
        while(x>0){
            count[x%10]++;
            x/=10;
        }
        // for(int i=0;i<10;i++){
        //     System.out.print(count[i]);
        // }

        for(int i=9;i>0;i--){
            if(i%2==0){
                esum+=count[i]*i;
            }
            for(int j=0;j<count[i];j++){
                sum*=10;
                sum+=i;
            }
        }

        
        System.out.println(sum);
        System.out.println("Sum of even numbers="+esum);
        if(esum>15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}