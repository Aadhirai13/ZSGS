import java.util.*;

public class Zsgs4{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num1,num2,res=0;
        System.out.println("Enter the number 1: ");
        num1 = sc.nextInt();

        System.out.println("Enter the number 2: ");
        num2 = sc.nextInt();

        res = num1 & num2;
        System.out.println("Bitwise AND : " + res);

        res = num1 | num2;
        System.out.println("Bitwise OR : " + res);

        res = num1 ^ num2;
        System.out.println("Bitwise XOR : " + res);

        res = ~num1;
        System.out.println("Bitwise NOT : " + res);
        
    }
}