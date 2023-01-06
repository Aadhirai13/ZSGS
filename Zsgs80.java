import java.util.*;

public class Zsgs80{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int count = 0,n = sc.nextInt();
        int[][] arr = new int[n][n];
        int total = n*n;

        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0)
                    count++;
            }
        }

        if(count > total/2)
            System.out.println("sparse matrix");
        else
            System.out.println("not an sparse matrix");
    }
}