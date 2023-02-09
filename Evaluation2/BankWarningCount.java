package febevaluation;
import java.util.*;

public class BankWarningCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of days and trailing days");
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] expenditures = new int[n];
		
		System.out.println("Enter expenditures of " + n + " days : ");
		for(int i = 0;i < n;i++) {
			expenditures[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(expenditures));
		
		int warningCount = 0;
		
		for(int i = d ; i < expenditures.length ; i++) {
			System.out.println(i-d + " " + i);
			int[] temp = Arrays.copyOfRange(expenditures, i-d, i);
			int median = findMedian(temp , d);
			if(expenditures[i] >= 2 * median)
				warningCount++;
		}
		
		System.out.println(warningCount);
	}
	
	public static int findMedian(int[] arr , int d) {
		Arrays.sort(arr);
		int median = 0;
		if(d % 2 != 0)
			median = arr[d%2];
		else {
			median = (arr[d/2] + arr[(d/2)+1]) / 2;
		}
		return median;
	}

}
