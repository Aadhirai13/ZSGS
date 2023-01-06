import java.util.*;

public class Zsgs84{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int even = 1, odd = 1, n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        }

        HashMap<String,Integer> h1 = new HashMap<String,Integer>();

        for(int[] i : arr){
            for(int j : i){
                if(j % 2 == 0)
                    h1.put("even",even++);
                else
                    h1.put("odd",odd++);
            }
        }

        for(Map.Entry<String,Integer> entry : h1.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());       
    }
}