import java.util.Scanner;

public class prog24 {
    static void incanddec(String stat, int num){
        if(stat.equals("inc")){
            if(num>1){
                num=num+1;
                System.out.println(num);
            }
        }else if(stat.equals("dec")){
            if(num>1){
                num=num-1;
                System.out.println(num);
            }
        }else{
            System.out.println("error");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String stat=sc.nextLine();
        int num=sc.nextInt();
        incanddec(stat, num);
    }
}
