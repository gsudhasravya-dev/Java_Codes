import java.util.*;

public class prog44 {

    static void salarycalculator(String role) {
        String lowerrole = role.toLowerCase();

        if (lowerrole.equals("team leader")) {
            System.out.println("80000");
        } 
        else if (lowerrole.equals("senior developer")) {
            System.out.println("70000");
        } 
        else if (lowerrole.equals("tester")) {
            System.out.println("60000");
        } 
        else if (lowerrole.equals("intern")) {
            System.out.println("30000");
        } 
        else {
            System.out.println("45000");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();
        salarycalculator(role);
    }
}