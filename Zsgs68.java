import java.util.*;

public class Zsgs68{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int sum = 0, n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        for(int i : arr)
            sum += i;
        System.out.println("Sum is " + sum);
    }
}