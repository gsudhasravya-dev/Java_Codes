import java.util.*;

public class prog25 {
    static void currconverter(double dollars){
        double rupees=dollars*96;
        System.out.println(rupees+" rupees");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double dollars=sc.nextDouble();
        currconverter(dollars);
    }
}
