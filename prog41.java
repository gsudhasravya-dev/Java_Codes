import java.util.*;

public class prog41 {
    static void checkleapyear(int num){
        if(num%4==0 || num%400==0){
            System.out.println("It's a leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        checkleapyear(num);
    }
    
}
