package febevaluation;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		sort(arr);
	}
	
	public static void sort(int[] arr) {
		int j = 0;
		for(int i = 1; i < arr.length ;i++) {
			int key = arr[i];
			j = i-1;
			while(j>=0 && key<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}

}
