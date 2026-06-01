import java.util.*;
public class prog39{
    static void multable(int num){
        for(int i=1;i<=10;i++){
            int mul=num*i;
            System.out.println(num+"*"+i+"="+mul);
            
    
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        multable(num);
    }
}