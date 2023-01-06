import java.util.*;

public class Zsgs63a{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        Collections.sort(Arrays.asList(arr));
        System.out.println("Smallest element : " + arr[0] + " & largest element : " + arr[n-1] );
    }
}