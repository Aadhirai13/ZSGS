import java.util.*;

public class Zsgs98a{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char: ");
        char ch = sc.next().charAt(0);
        if(ch >= 97 && ch <= 122){
            System.out.println(Character.toUpperCase(ch));
        }
        else
            System.out.println("not a small letter alphabet");
    }
}