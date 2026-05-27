import java.util.*;

public class prog21 {
    void calculateinterest(double p, double r, double t, int n){
        double amount=p*(Math.pow((1+(r/n)),n*t));
        System.out.println("interest is: "+amount);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal:");
        double p=sc.nextDouble();
        System.out.println("enter rate:");
        double r=sc.nextDouble();
        System.out.println("enter time:");
        double t=sc.nextDouble();
        System.out.println("enter no. of years:");
        int n=sc.nextInt();

        prog21 obj=new prog21();
        obj.calculateinterest(p,r,t,n);
    }
    
}
