import java.util.*;

public class Zsgs17{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of outer circle : ");
        float rad1 = sc.nextFloat();
        System.out.println("Enter radius of inner circle : ");
        float rad2 = sc.nextFloat();

        double area = area(rad1) - area(rad2);

        System.out.println(area);
    }

    public static double area(float rad){
        return Math.PI * Math.pow(rad,2);
    }
}