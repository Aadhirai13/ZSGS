import java.util.*;

public class Zsgs46{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int last = arr[n-1];
        for(int i=n-2;i>=0;i--)
            arr[i+1] = arr[i];
        arr[0] = last;

        for(int i : arr)
            System.out.print(i + " ");
    }
}