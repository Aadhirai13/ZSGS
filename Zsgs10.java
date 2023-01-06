import java.util.*;

public class Zsgs10{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of items in array : ");
        int i=0,j=0,n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];

        for(int index=0;index<n;index++)
            arr[index]=sc.nextInt();
        
        Arrays.sort(arr);
        
        while(i<n){
            if(j%2==0){
                res[j]=arr[n-1];
                n--;
                j++;
            }
            else{
                res[j]=arr[i];
                j++;
                i++;
            }
        }

        for(int num : res)
            System.out.print(num);
    }
}