import java.util.*;

public class Zsgs29{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        String result = "",str = "aeiouAEIOU" ;
        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)){
            result = (str.indexOf(ch) != -1) ? "Given char is vowel" : "Given char is consonant" ;
        }
        System.out.println(result);
    }
}