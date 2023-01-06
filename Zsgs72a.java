import java.util.*;

public class Zsgs72a{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for(int i : arr){
            if(h1.containsKey(i))
                h1.put(i,h1.get(i)+1);
            else
                h1.put(i,1);
        }

        for(Map.Entry<Integer,Integer> entry : h1.entrySet())
            System.out.print(entry.getKey());
    }
}