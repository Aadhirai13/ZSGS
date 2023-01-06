import java.util.*;

public class Zsgs65{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(h1.containsKey(arr[i]))
                h1.put(arr[i],h1.get(arr[i])+1);
            else
                h1.put(arr[i],1);
        }

        for(Map.Entry<Integer,Integer> entry : h1.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());       
    }
}