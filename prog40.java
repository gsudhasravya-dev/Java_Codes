import java.util.*;

public class prog40 {
    static void sumnatural(int num){
        int sum=(num*(num+1))/2;
        System.out.println(sum);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sumnatural(num);

    }
    
}
