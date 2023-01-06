import java.util.*;

public class Zsgs65a{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.next();

        HashMap<String,Integer> h1 = new HashMap<String,Integer>();

        for(int i=0;i<arr.length;i++){
            if(h1.containsKey(arr[i]))
                h1.put(arr[i],h1.get(arr[i])+1);
            else
                h1.put(arr[i],1);
        }

        for(Map.Entry<String,Integer> entry : h1.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());       
    }
}