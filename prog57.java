import java.util.*;

public class prog57 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        String word=sc.nextLine();
        String ch_word=word.toLowerCase();
        int pos=sc.nextInt();
        char ch=ch_word.charAt(pos);
        if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
            System.out.println("It's a vowel");
        }else if(Character.isLetter(ch)==true){
            System.out.println("It's a consonant");
        }else{
            System.out.println("Invalid");
        }
    }
    
}
