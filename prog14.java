public class prog14 {
    void areaRec(int length, int breadth){
        int area=length*breadth;
        System.out.println( area);
    }

    public static void main(String[] args){
        prog14 obj=new prog14();
        obj.areaRec(23,45);
    }
    
}
