import java.util.*;

public class Zsgs95a{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String rev = "";

        for(int i=str1.length()-1;i>=0;i--)
            rev += str1.charAt(i);

        if((str1.length() == str2.length()) && rev.equals(str2))
            System.out.println("Two strings are palindrome to each other");
        else
            System.out.println("Two strings are not palindrome to each other");

    }
}