import java.util.*;
import java.util.regex.Pattern;

public class Zsgs89{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String arr[] = new String[100];

        Pattern ptn = Pattern.compile(" ");

        arr = ptn.split(str);

        for(String s : arr)
            System.out.println(s);
    }
}