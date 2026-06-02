import java.util.*;

public class prog46 {

    static void calcmenu(String operand, float operator1, float operator2) {

        if (operand.equals("+")) {
            System.out.println(operator1 + operator2);
        }
        else if (operand.equals("-")) {
            System.out.println(operator1 - operator2);
        }
        else if (operand.equals("*")) {
            System.out.println(operator1 * operator2);
        }
        else if (operand.equals("/")) {
            System.out.println(operator1 / operator2);
        }
        else if (operand.equals("**")) {
            System.out.println(Math.pow(operator1, operator2));
        }
        else if (operand.equals("%")) {
            System.out.println(operator1 % operator2);
        }
        else {
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter operand:");
        String operand = sc.nextLine();

        System.out.println("Enter operator1:");
        float operator1 = sc.nextFloat();

        System.out.println("Enter operator2:");
        float operator2 = sc.nextFloat();

        calcmenu(operand, operator1, operator2);
    }
}