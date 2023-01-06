import java.util.*;

public class Zsgs42{

    public static void main(String args[]){

        int n,count,visited = -1;
        int arr[] = new int[100];

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int freq[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[j]==arr[i] && arr[j]!= visited){
                    count++;
                    arr[j] = visited;
                }
            }
            freq[i] = count;
        }

        for(int i=0;i<n;i++){
            if(arr[i]!=visited)
            System.out.print(arr[i] + "-" + freq[i] + " ");
        }
       
    }
}