import java.util.*;

public class prog22 {
    static void checklogical(int num1, int num2){
        if(num1<10 && num2<10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(num1<10 || num2<10){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        checklogical(num1, num2);

    }
    
    
}
