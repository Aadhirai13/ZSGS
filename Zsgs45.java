import java.util.*;

public class Zsgs45{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        int sum = 0, arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        for(int num : arr)
            sum += num;
        System.out.println("Sum of elements in array is : " + sum);
    }
}