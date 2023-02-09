package febevaluation;
import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		printPattern(n);
	}
	
	public static void printPattern(int n) {
		int size = n;
		int arr[][] = new int[n][n];
		while(n > size/2) {
			for(int row = size-n;row < n;row++) {
				for(int col = size-n;col < n;col++) {
					if(size-row == n || row == n-1 || size-col == n || col == n-1) {
						arr[row][col] = 1;
					}
				}
			}
			n -= 2;
		}
		for(int[] x : arr) {
			for(int y : x)
				System.out.print(y);
			System.out.println();
		}
	}

}
