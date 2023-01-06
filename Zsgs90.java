import java.util.*;

public class Zsgs90{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String arr[] = new String[100];

        arr = str.split(" ");
        Collections.sort(Arrays.asList(arr));
        for(String s : arr)
            System.out.println(s);
    }
}