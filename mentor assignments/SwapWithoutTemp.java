package practiceprogramms;
import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 no's a and b : ");
		int a = sc.nextInt(), b = sc.nextInt();
	
		SwapWithTemp obj = new SwapWithTemp();
		obj.swap(a,b);
	}
	
	public void swap(int a,int b) {
		a = (a + b) - (b = a);
		System.out.println("a and b after swapping : " + a + " " + b);
	}

}
