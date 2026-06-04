import java.util.*;

public class prog60 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=sc.nextLine();
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }

        if(word.equals(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    }
    
}
