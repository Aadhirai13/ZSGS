import java.util.*;

public class Zsgs74{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns for arr1 : ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println("Enter number of rows and columns for arr2 : ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        int[][] res = new int[row1][col2];

        if(row1 != col2)
            System.out.println("Can't multiply the given matrices");

        else{
            System.out.println("Enter array1 elements");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++)
                    arr1[i][j] = sc.nextInt();
            }
            
            System.out.println("Enter array2 elements");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++)
                    arr2[i][j] = sc.nextInt();
            }
        

            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        res[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++)
                    System.out.print(res[i][j] + " ");
                System.out.println();
        }
        }
    }
}