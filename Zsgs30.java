import java.util.*;

public class Zsgs30{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        System.out.println("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        arr[0] = a ;
        arr[1] = b ;
        arr[2] = c ;
        
        Arrays.sort(arr);

        System.out.println("Largest Number Among Three Numbers is " + arr[2]);
    }
}