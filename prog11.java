import java.util.*;

public class prog11 {
    static void calculateArea(float length,float breadth){
        float area=2*(length+breadth);
        System.out.println("area is:"+ area);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        float length=sc.nextFloat();
        System.out.println("Enter breadth: ");
        float breadth=sc.nextFloat();
        calculateArea(length, breadth);
    }
    
}
