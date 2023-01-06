import java.util.*;

public class Zsgs77a{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();

        Arrays.sort(arr);
        for(int num : arr)
            System.out.print(num);
    }
}