import java.util.*;

public class Zsgs99{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();     
        int a;
        char ch;

        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            a = (int)ch;
            if(ch >= 97 && ch <= 122)
                a -= 32;
            System.out.print((char)a);
        }
    }
}