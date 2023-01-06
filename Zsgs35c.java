import java.util.*;

public class Zsgs35c{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int fact,sum,num = sc.nextInt();
        fact = factorial(num);
        System.out.println("Factorial is : " + fact);
        sum = sum(fact);
        System.out.println("sum is : " + sum);
    }

    static int factorial(int n){
        int i=1, fact = 1;
        do{
            fact *= i;
            i++;
        }while(i <= n);
        return fact;
    }

    static int sum(int n){
        int rem,sum = 0;
        while(n != 0){
            rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
}