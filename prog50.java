import java.util.*;

public class prog50 {
    static void attcalc(int dayspresent){
        int workingdays=70;
        float percentage=((float)dayspresent/workingdays)*100;
        System.out.println("Attendence percentage:"+percentage+"%");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of days present (out of 70):");
        int dayspresent=sc.nextInt();
        attcalc(dayspresent);

    }
    
}
