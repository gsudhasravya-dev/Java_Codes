import java.util.*;

public class prog7 {
    void calculateinterest(float p, float r, int t){
        float interest=(p*t*r)/100;
        System.out.println("interest is: "+interest);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal:");
        float p=sc.nextFloat();
        System.out.println("enter rate:");
        float r=sc.nextFloat();
        System.out.println("enter time:");
        int t=sc.nextInt();

        prog7 obj=new prog7();
        obj.calculateinterest(p,r,t);
    }
    
}
