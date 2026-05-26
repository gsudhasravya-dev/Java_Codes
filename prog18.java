import java.util.*;

public class prog18 {
    static void findlarge(int num1, int num2){
        if(num1>num2){
            System.out.println("num1 greater");
        }else{
            System.out.println("num2 greater");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        findlarge(num1, num2);
    }
}
