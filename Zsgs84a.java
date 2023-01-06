import java.util.*;

public class Zsgs84a{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int even = 0, odd = 0, n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        }

        for(int[] i : arr){
            for(int j : i){
                if(j % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }

        System.out.println("Even " + even + " & odd " + odd);       
    }
}