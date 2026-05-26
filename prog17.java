import java.util.*;

public class prog17 {
    static void findlarge(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println("num1 greater");
        }else if(num2>num1 && num2>num3 ){
            System.out.println("num2 greater");
        }else{
            System.out.println("num3 greater");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        findlarge(num1, num2, num3);
    }
}
