import java.util.*;

public class Zsgs51{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        System.out.println(reverse(num));
    }

    public static int reverse(int a){
        int rev = 0,r,num = a;
        while(num != 0){
            r = num % 10;
            rev = rev*10 + r;
            num = num/10;
        }
        return rev;
    }
}