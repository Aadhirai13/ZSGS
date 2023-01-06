import java.util.*;

public class Zsgs70b{
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        for(int i : arr){
            if(h1.containsKey(i))
                h1.put(i,h1.get(i)+1);
            else
                h1.put(i,1);
        }
        int size=1, mapSize = h1.size();
        if(mapSize == 1)
            System.out.println("There is no second largest element");
        
        else{
            for(Map.Entry<Integer,Integer> entry : h1.entrySet()){
                if(size == mapSize-1)
                    System.out.println("Second maximum element is " + entry.getKey());
                    size++;
            }
        }
    }
}