import java.util.*;

public class Zsgs95{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        StringBuilder s = new StringBuilder();

        s.append(str2);
        s.reverse();

        if((str1.length() == str2.length()) && str1.equals(s.toString()))
            System.out.println("Two strings are palindrome to each other");
        else
            System.out.println("Two strings are not palindrome to each other");

    }
}