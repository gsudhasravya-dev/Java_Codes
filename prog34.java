import java.util.*;

public class prog34 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your decimal number:");
        double num1=sc.nextDouble();
        System.out.println("Enter your integer number:");
        int num2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a word:");
        String word=sc.nextLine();
        System.out.println((int)num1);
        System.out.println((double)num2);
        System.out.println(word.charAt(0));
    }
}
