import java.util.*;

public class prog55 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Item name:");
        String item_name=sc.nextLine();
        System.out.println("Item price:");
        float item_price=sc.nextFloat();
        System.out.println("Item quantity:");
        int item_quantity=sc.nextInt();
        float total=item_quantity*item_price;
        System.out.println("Total bill is:"+total);

    }
    
}
