import java.util.*;

public class Zsgs43{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int first = arr[0];
        for(int i=1;i<n;i++)
            arr[i-1] = arr[i];
        arr[n-1] = first;

        for(int i : arr)
            System.out.print(i + " ");
    }
}