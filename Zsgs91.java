import java.util.*;

public class Zsgs91{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for(char ch : arr)
            System.out.print(ch);
    }
}