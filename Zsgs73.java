import java.util.*;

public class Zsgs73{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];

        System.out.println("Enter array1 elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                arr1[i][j] = sc.nextInt();
        }
        
        System.out.println("Enter array2 elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                arr2[i][j] = sc.nextInt();
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                arr1[i][j] += arr2[i][j];
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                System.out.print(arr1[i][j] + " ");
            System.out.println();
        }
    }
}