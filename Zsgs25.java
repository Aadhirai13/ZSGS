import java.util.*;

public class Zsgs25{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend and divisor : ");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient : " + quotient + " Remainder : " + remainder);
    }
}