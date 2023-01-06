import java.util.*;

public class Zsgs62a{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println("even position elements : ");
        for(int i=0;i<n;i+=2)
            System.out.print(arr[i]);

        System.out.println("\nodd position elements : ");
        for(int i=1;i<n;i+=2)
            System.out.print(arr[i]);
    }
}