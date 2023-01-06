import java.util.*;

public class Zsgs71{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int min = 999,secMin=0, n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                secMin =min;
                min = arr[i];
            }
            else if(arr[i]>min && arr[i]<secMin)
                secMin = arr[i];
        }
        if(n==1)
            System.out.println("There is no second largest element");
        else
            System.out.println("Second minimum element is " + secMin);
    }
}