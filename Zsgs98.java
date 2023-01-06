import java.util.*;

public class Zsgs98{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char: ");
        char ch = sc.next().charAt(0);
        int a;
        if(ch >= 97 && ch <= 122){
            a = (int)ch - 32;
            System.out.println((char)a);
        }
        else
            System.out.println("not a small letter alphabet");
    }
}