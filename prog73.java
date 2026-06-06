import java.util.*;
public class prog73{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int guess=sc.nextInt();
        int og=guess;
        while(num!=guess){
            if(guess>num){
                System.out.println("lower");
            }else{
                System.out.println("higher");
            }
            System.out.println("Enter another guess:");
            guess=sc.nextInt();
        }
        System.out.println("You won");
    }
}