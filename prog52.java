import java.io.*;

public class prog52 {
    public static void main(String[] args){
        Console con=System.console();

        if(con!=null){
            char[] pw=con.readPassword("Enter your password:");
            System.out.println("Password exists");
        }else{
            System.out.println("Password not exists");

        }
    }
    
}
