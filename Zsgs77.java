import java.util.*;

public class Zsgs77{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                    arr[i] = (arr[i]+arr[j]) - (arr[j]=arr[i]);
            }
        }

        for(int num : arr)
            System.out.print(num);
    }
}