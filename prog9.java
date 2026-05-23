import java.util.*;
public class prog9{
    void checkstatus(int num){
        if(num<0){
            System.out.println("negative");
        }
        else if(num>0){
            System.out.println("positive");
        }
        else{
            System.out.println("zero");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        prog9 obj=new prog9();
        obj.checkstatus(num);
    }
}