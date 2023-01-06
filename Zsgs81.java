import java.util.*;

public class Zsgs81{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        boolean identical = true;
        System.out.println("Enter number of rows and columns for arr1 : ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println("Enter number of rows and columns for arr2 : ");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];

        if((row1 != row2) || (col1 != col2))
            System.out.println("not equal");

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
        
            aa:
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    if(arr1[i][j] != arr2[i][j]){
                        identical = false;
                        break aa;
                    }
                }
            }

            if(identical)
                System.out.println("Equal matrix");
            else
                System.out.println("not equal");
        }
    }
}