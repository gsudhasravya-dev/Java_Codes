import java.util.*;

public class prog20 {
    static void arithmeticoperators(int num1, int num2){
        boolean eq=(num1==num2);
        boolean noteq= num1!=num2;
        boolean lesseq=num1<=num2;
        boolean greaeq=num1>=num2;
        boolean less=num1<num2;
        boolean great=num1>num2;
        System.out.println(eq+" "+ noteq+" "+lesseq+" "+ greaeq+" "+less+" " +great);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        arithmeticoperators(num1,num2);
    }
    
}
