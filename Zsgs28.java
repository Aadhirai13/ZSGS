import java.util.*;

public class Zsgs28{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        String str = (num % 2 == 0) ? "Given number is even" : "Given number is odd" ;
        System.out.println(str);
    }
}