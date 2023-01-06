import java.util.*;

public class Zsgs69{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int last = arr[n-1];

        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        for(int a : arr)
            System.out.print(a);
    }
}
