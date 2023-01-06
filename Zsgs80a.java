import java.util.*;

public class Zsgs80a{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int total = n*n;
        boolean sparse = false;
        HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();

        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        }
        
        for(int[] i : arr){
            for(int j : i){
                if(h1.containsKey(j))
                    h1.put(j,h1.get(j)+1);
                else
                    h1.put(j,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : h1.entrySet()){
            if(entry.getKey() == 0 && entry.getValue()>(total/2)){
                sparse = true;
                break;      
            }
        }

        if(sparse)
            System.out.println("Sparse matrix");
        else
            System.out.println("not a Sparse matrix");
    }
}