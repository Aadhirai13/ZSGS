import java.util.*;

public class Zsgs70{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int max = 0,secMax=0, n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>secMax)
                secMax = arr[i];
        }
        if(n==1)
            System.out.println("There is no second largest element");
        else
            System.out.println("Second maximum element is " + secMax);
    }
}