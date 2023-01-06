import java.util.*;

public class Zsgs75a{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        System.out.println("Even items:");
        for(int num : arr){
            if(num % 2 == 0){
                System.out.print(num);
            }
        }

        System.out.println("\nOdd items:");
        for(int num : arr){
            if(num % 2 != 0){
                System.out.print(num);
            }
        }
    }
}