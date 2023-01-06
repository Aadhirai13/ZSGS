import java.util.*;

public class Zsgs14{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle : ");
        float length = sc.nextFloat();
        float width = sc.nextFloat();

        double area = length * width;

        System.out.println(area);
    }
}