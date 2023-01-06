import java.util.*;

public class Zsgs89a{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        StringTokenizer s = new StringTokenizer(str);
        int count = s.countTokens();
        String arr[] = new String[count];

        while(s.hasMoreTokens()){
            arr[i] = s.nextToken();
            i++;
        }
        for(String s1 : arr)
            System.out.println(s1);
    }
}