import java.util.*;

public class prog43 {
    static void agechecker(int age){
        if(age>=18){
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        agechecker(age);

    }
    
}
