package midjan;

import java.util.Arrays;

public class EqualSumSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1,5};
		splitArrays(arr);
	}
	public static void splitArrays(int[] arr) {
		int i = 0;
		for(int j=2;j<arr.length-1;j++) {
			int a[] = Arrays.copyOfRange(arr, i, j);
			int b[] = Arrays.copyOfRange(arr, j, arr.length);
			if(Arrays.stream(a).sum() == Arrays.stream(b).sum()) {
				System.out.println("The two arrays are " + toString(a) + " & " + toString(b));
				break;
			}
			
		}
	}
	
	public static String toString(int[] arr) {
		String str = "{";
		for(int i=0;i<arr.length-1;i++)
			str += arr[i] + ",";
		str += arr[arr.length-1] + "}";
		return str;
	}

}
