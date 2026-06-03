import java.util.*;

public class prog56 {
    public static void main(String[] args){
        double balance=890.6;

        Scanner sc=new Scanner(System.in);
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Balance check:");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                balance=balance+sc.nextInt();
                System.out.println(balance);
                break;

            case 2:
                balance=balance-sc.nextInt();
                System.out.println(balance);
                break;

            case 3:
                System.out.println("Balance:"+balance);
                break;
        }

    }
    
}
