import java.util.*;

public class Zsgs75{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items");
        int n = sc.nextInt();
        int arr[] = new int[n];
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        Arrays.stream(arr).forEach((num) -> {
        if(num%2 == 0)
            evenList.add(num);
        else
            oddList.add(num);});

        System.out.println(evenList.toString());
        System.out.println(oddList.toString());
    }
}