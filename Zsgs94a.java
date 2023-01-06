import java.util.*;

public class Zsgs94a{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        HashMap<Character,Integer> h1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> h2 = new HashMap<Character,Integer>();

        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(h1.containsKey(ch))
                h1.put(ch,h1.get(ch)+1);
            else
                h1.put(ch,1);
        }

        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            if(h2.containsKey(ch))
                h2.put(ch,h2.get(ch)+1);
            else
                h2.put(ch,1);
        }

        if(h1.equals(h2))
            System.out.println("Two strings are anagram to each other");
        else
            System.out.println("Two strings are not anagram to each other");

    }
}