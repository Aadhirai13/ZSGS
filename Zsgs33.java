import java.util.*;

public class Zsgs33{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        String result = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) ? "Given char is Alphabet" : "Given char is not an Alphabet" ;
        System.out.println(result);
    }
}