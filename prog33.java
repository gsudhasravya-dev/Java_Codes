import java.util.*;

public class prog33 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println("Before Changing");
        System.out.println(num1);
        System.out.println(num2);

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After Changing");
        System.out.println(num1);
        System.out.println(num2);
    }
    
}
