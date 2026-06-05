import java.util.*;

public class prog66 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        int nodigits=String.valueOf(num).length();
        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,nodigits);
            num=num/10;
        }
        if(original==sum){
            System.out.println("yes, armstrong");
        }else{
            System.out.println("no, not armstrong");
        }

    }
    
}
