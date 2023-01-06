import java.util.*;

public class Zsgs20{

    public static void main(String[] args){

        int x = 10;
        x = x++ * 2 + 3 * --x;
        System.out.println("result is : " + x);
    }
}