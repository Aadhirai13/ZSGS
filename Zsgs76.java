import java.util.*;

public class Zsgs76{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter array elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                arr[i][j] = sc.nextInt();
        }

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++)
                System.out.print(arr[j][i] + " ");
            System.out.println();
        }
    }
}