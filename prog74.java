import java.util.*;
public class prog74{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Num of units consumed:");
        int units=sc.nextInt();
        int price=0;
        if(units<100){
            price=0;
        }else if(units<=200){
            price=price+(units*2);
        }else if(units<=300){
            price=price+(units*3);
        }else{
            price=price+(units*6);
        }
        System.out.println("price:"+price+" rupees");
    }
}