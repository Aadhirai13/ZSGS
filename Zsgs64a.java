import java.util.*;

public class Zsgs64a{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int newArr[] = Arrays.copyOf(arr,n);
        for(int i : newArr)
            System.out.print(i);
    }
}