import java.util.*;

public class Zsgs44a{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for(int i=0;i<n;i++){
            if(h1.containsKey(arr[i]))
                h1.put(arr[i],h1.get(arr[i])+1);
            else 
                h1.put(arr[i],1);
        }

        System.out.println("Duplicate elements are : ");
        for(Map.Entry<Integer,Integer> entry : h1.entrySet()){
            if(entry.getValue() != 1)
                System.out.println(entry.getKey());
        }
    }
}