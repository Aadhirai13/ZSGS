import java.util.*;

public class Zsgs79{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int n = sc.nextInt();
        boolean identity = true;
        int[][] arr = new int[n][n];

        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        }
        
        aa:
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!((i==j && arr[i][j]==1) || (i!=j && arr[i][j]==0))){
                    identity = false;
                    break aa;
                }
            }
        }

        if(identity)
            System.out.println("Identity matrix");
        else
            System.out.println("not an Identity matrix");
    }
}