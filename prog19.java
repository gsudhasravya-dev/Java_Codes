import java.util.*;

public class prog19 {
    static void arithmeticoperators(int num1, int num2){
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        int pow=num1^num2;
        int mod=num1%num2;
        System.out.println(add+" "+ sub+" "+mul+" "+ div+" "+pow+" " +mod);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        arithmeticoperators(num1,num2);
    }
    
}
