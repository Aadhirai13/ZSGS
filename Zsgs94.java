import java.util.*;

public class Zsgs94{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        str1 = new String(arr1);
        str2 = new String(arr2);
        if((str1.length() == str2.length()) && str1.equals(str2))
            System.out.println("Two strings are anagram to each other");
        else
            System.out.println("Two strings are not anagram to each other");

    }
}