import java.util.*;

public class Zsgs9{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms for array1 : ");
        int m = sc.nextInt();

        System.out.println("Enter number of terms for array2 : ");
        int n = sc.nextInt();

        int arr1[] = new int[m];
        int arr2[] = new int[n];

        for(int i=0;i<m;i++)
            arr1[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            arr2[i] = sc.nextInt();

        int i,j;
        for(i=0,j=0;i<m && j<n;){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }
            else if(arr2[j]<arr1[i]){
                System.out.print(arr2[j] + " ");
                j++;
            }
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while(i<m){
            System.out.print(arr1[i] + " ");
            i++;
        }
        while(j<n){
            System.out.print(arr2[j] + " ");
            j++;
        }
    }
}