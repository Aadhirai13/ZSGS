import java.util.*;

public class Zsgs86{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        char arr[] = new char[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.next().charAt(0);

        for(char ch : arr)
            System.out.print(ch + " ");
    }
}