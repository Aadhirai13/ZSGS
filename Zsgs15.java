import java.util.*;

public class Zsgs15{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height of rectangle : ");
        float radius = sc.nextFloat();
        float height = sc.nextFloat();

        double volume = Math.PI * Math.pow(radius,2) * height; // volume of cylinder

        System.out.format("%.5f",(float)volume);
    }
}