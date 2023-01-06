import java.util.*;

public class Zsgs3{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num1,num2;
        num1 = sc.nextInt();
        num2 = reverse(num1);
        int result = num1 - num2;
        System.out.println(result);
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