public class prog5{
    int a=10;
    int b=20;
    void checkequality(){
        if(a==b){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    public static void main(String[] args){
        prog5 obj=new prog5();
        obj.checkequality();
    }
}