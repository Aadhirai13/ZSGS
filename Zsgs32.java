import java.util.*;

public class Zsgs32{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num == 0)
            str = "Given number is zero";
        else
            str = (num > 0) ? "Given number is positive" : "Given number is negative" ;
        System.out.println(str);
    }
}