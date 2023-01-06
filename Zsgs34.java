import java.util.*;

public class Zsgs34{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int sum,num = sc.nextInt();
        sum = (num * (num + 1)) / 2;
        largest(sum);
        System.out.println("Sum is " + sum);
    }

    public static void largest(int sum){
        int arr[] = new int[50];
        int rem,i=0;
        while(sum != 0){
            rem = sum % 10;
            arr[i] = rem;
            i++;
            sum = sum / 10;
        }
        Arrays.sort(arr);
        System.out.println("Largest is " + arr[49]);
    }
}