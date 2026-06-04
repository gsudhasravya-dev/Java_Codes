import java.util.*;

public class prog59 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num_start=sc.nextInt();
        int num_end=sc.nextInt();
        for(int i=num_start;i<=num_end;i++){
            boolean isPrime=true;
            if(i<2){
                isPrime=false;
            }else{
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }

                }
            }

            if(isPrime){
                System.out.println(i+" ");
            }
        }
    }   
    
}

