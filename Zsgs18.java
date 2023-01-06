import java.util.*;

public class Zsgs18{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calc1(a,b);
        calc2(a,b);
        calc3(a,b);
        calc4();

    }

    public static void calc1(int a,int b){
        int res = ++a - b--;
        System.out.println("result 1 : " + res);
    }

    public static void calc2(int a,int b){
        int res = a % b++;
        System.out.println("result 2 : " + res);
    }

    public static void calc3(int a,int b){
        a *= b+5;
        System.out.println("result 3 : " + a);
    }

    public static void calc4(){
        int x = 69 >>> 2;
        System.out.println("result 4 : " + x);
    }
}