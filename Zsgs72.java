import java.util.*;

public class Zsgs72{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();
        int duplicate = -1, arr[] = new int[n];
        boolean found = false;

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for(int i=0;i<n;i++){
            found = false;
            for(int j=i+1;j<n;j++){
                if((arr[i] != duplicate) && (arr[i] == arr[j])){
                    arr[j] = duplicate;
                    found = true;
                }
            }
            if((arr[i] != duplicate))
                System.out.print(arr[i] + " ");
        }
    }
}