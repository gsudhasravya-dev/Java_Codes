import java.util.*;

public class prog6{
    void checkleap(int year){
        if(year%4==0 && year%400==0){
            System.out.println("leap");
        }else{
            System.out.println("not leap");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        prog6 obj=new prog6();

        obj.checkleap(year);
    }
}
