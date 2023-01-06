import java.util.*;

public class Zsgs87c{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        char arr[] = new char[n];
        StringBuilder str = new StringBuilder();

        for(int i=0;i<n;i++)
            arr[i] = sc.next().charAt(0);

        for(char ch : arr)
            str.append(ch);
        System.out.print(str);
    }
}