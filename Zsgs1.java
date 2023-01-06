import java.util.*;

public class Zsgs1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int mul,sub,cnt,num = sc.nextInt();

        //Multiplication table
        System.out.println("Multiplication table");
        for(int i=1;i<=16;i++){
            mul = i*num;
            System.out.println(i + " * " + num + " = " + mul);
        }

        //Subtraction table
        System.out.println("Subtraction table");
        cnt = num;
        for(int i=1;i<=16;i++){
            sub = cnt-num;
            System.out.println(cnt + " - " + num + " = " + sub);
            cnt++;

        }
    }
}
