import java.util.*;

public class Zsgs37{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        for(int i=1;i<n;i+=2)
            System.out.println(arr[i]);
    }
}