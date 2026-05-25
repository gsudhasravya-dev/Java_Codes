import java.util.*;

public class prog11{
    void checkArea(double r){
        float pi= 3.14f;
        double area=pi*r*r;
        System.out.println(area);
    }

    public static void main(String[] args){
        prog11 r=new prog11();
        r.checkArea(22.3);

    }


}