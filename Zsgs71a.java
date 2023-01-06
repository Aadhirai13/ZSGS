import java.util.*;

public class Zsgs71a{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        if(n==1)
            System.out.println("There is no second largest element");
        else
            System.out.println("Second maximum element is " + arr[1]);
    }
}