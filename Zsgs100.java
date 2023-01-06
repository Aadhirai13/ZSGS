import java.util.*;

public class Zsgs100{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ASCII value: ");
        int val = sc.nextInt();
        char ch;

        if(val >= 65 && val <= 90)
            System.out.println((char)val);
        else
            System.out.println(val);       
    }
}