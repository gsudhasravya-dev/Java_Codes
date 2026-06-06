import java.util.*;
public class prog72{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        int og=num;
        int ans =1;
        for(int i=1;i<pow;i++){
            ans=og*num;
            num=ans;
        }
        System.out.println(ans);
    }
}