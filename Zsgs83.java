import java.util.*;

public class Zsgs83{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,u=1,l=1;
        n=sc.nextInt();
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j)
                    arr[i][j] = 0;
            }
        }
        System.out.println("Lower triangular matrix");
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}