import java.util.*;

public class Zsgs85{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int row = 0, col = 0, sum = 0, n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        }

        for(int[] i : arr){
            sum = Arrays.stream(i).sum();
            System.out.println("Row " + row + " is " + sum);
            row++;
        }

        sum = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum += arr[j][i];
            }
            System.out.println("Col " + col + " is " + sum);
            col++;
            sum = 0;
        }
    }
}