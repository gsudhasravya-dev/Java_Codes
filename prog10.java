import java.util.*;

public class prog10 {
    void checkdivisible(int num){
        if(num%4==0 && num%6==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        prog10 obj=new prog10();
        obj.checkdivisible(num);
    }
}
