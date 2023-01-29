package practiceprogramms;

import java.util.Arrays;

public class SecLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,9,2,86,95,35,27};
		Arrays.sort(arr);
		System.out.println("Second largest element is : " + arr[arr.length - 2]);
	}

}
