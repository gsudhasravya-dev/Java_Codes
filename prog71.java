import java.util.*;
public class prog71{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            int digit=num%10;
            count++;
            num/=10;
        }
        System.out.println("count:"+count);
    }
}