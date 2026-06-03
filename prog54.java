import java.util.*;
import java.time.LocalDate;

public class prog54 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date (yyyy-mm-dd):");
        String date=sc.nextLine();
        LocalDate d=LocalDate.parse(date);
        System.out.println("Date:"+d);
    }
    
}
