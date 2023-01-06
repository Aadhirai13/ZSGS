import java.util.*;

public class Zsgs41{

    public static void main(String[] args){

        int arr[] = {1,3,76,3,87,34,56};
        int arr1[] = new int[arr.length];
        arr1 = arr;
        for(int i : arr1)
            System.out.print(i + " ");

        System.out.println();
        
        int arr2[] = Arrays.copyOf(arr,arr.length);
        for(int i : arr2)
            System.out.print(i + " ");
    }
}