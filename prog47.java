import java.util.*;

public class prog47 {
    static void perccalc(float marks){
        float percentage=(marks/300)*100;
        System.out.println("Percentage:"+percentage+"%");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Marks (out of 300):");
        float marks=sc.nextFloat();
        perccalc(marks);
    }
    
}
