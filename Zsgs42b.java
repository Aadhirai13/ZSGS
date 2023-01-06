import java.util.*;

public class Zsgs42b{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> h1 = new HashMap<Character,Integer>();

        for(int i=0;i<arr.length;i++){
            if(h1.containsKey(arr[i]))
                h1.put(arr[i],h1.get(arr[i])+1);
            else
                h1.put(arr[i],1);
        }

        for(Map.Entry<Character,Integer> entry : h1.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());       
    }
}