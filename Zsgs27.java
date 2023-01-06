import java.util.*;

public class Zsgs27{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = (a + b) - (b=a);
        System.out.println("After swapping a and b : " + a + " and " + b);
    }
}