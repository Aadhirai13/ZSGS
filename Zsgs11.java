import java.util.*;

public class Zsgs11{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int col = sc.nextInt();

        int prev, curr, rowStart=0, colStart=0, rowEnd=row-1, colEnd=col-1;
        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }

        while(rowStart < rowEnd && colStart < colEnd){
            prev=arr[rowStart][colStart+1];
            for(int i=rowStart;i<=rowEnd;i++){
                curr=arr[i][colStart];
                arr[i][colStart]=prev;
                prev=curr;
            }
            colStart++;
            for(int i=colStart;i<=colEnd;i++){
                curr=arr[rowEnd][i];
                arr[rowEnd][i]=prev;
                prev=curr;
            }
            rowEnd--;
             for(int i=rowEnd;i>=rowStart;i--){
                curr=arr[i][colEnd];
                arr[i][colEnd]=prev;
                prev=curr;
            }
            colEnd--;
            for(int i=colEnd;i>=colStart;i--){
                curr=arr[rowStart][i];
                arr[rowStart][i]=prev;
                prev=curr;
            }
            rowStart++;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }
}