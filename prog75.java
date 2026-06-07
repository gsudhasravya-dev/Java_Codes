import java.util.*;

public class prog75 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of hours worked in a week:");
        float hours = sc.nextInt();
        int weekly_limit=40;
        System.out.println("Your Salary:");
        int salary=sc.nextInt();
        double bonus;
        if(hours>weekly_limit){
            bonus=(15.0/100)*salary;
        }else if(hours > 20 && hours < 30){
            bonus=(10.0/100)*salary;
        }
        else if(hours>10 && hours<20){
            bonus=(5.0/100)*salary;
        }else{
            bonus=(2.0/100)*salary;
        }
        System.out.println("Bonus = " + bonus);
        System.out.println("Salary after bonus:" + (salary+bonus));


    }
    
}
