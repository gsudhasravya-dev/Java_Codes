import java.util.*;

public class prog8{
    void checkdivisibility(int num){
        if(num%3==0 && num%5==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        prog8 obj=new prog8();
        obj.checkdivisibility(num);
    }
}