import java.util.*;

public class prog67 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int og=num;
        int sum=0;
        while(num>0){
            int digit=num%10;

            int fact=1;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            
            sum+=fact;
            num/=10;
        }
         if(og==sum){
        System.out.println("Strong");
        }else{
            System.out.println("Not Strong");
        }
    }
}
