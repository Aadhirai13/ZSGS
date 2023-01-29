package practiceprogramms;
import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		int n = num, remainder = 0, result = 0,cnt = 0;

		while (n != 0) {
		   n /= 10;
		   cnt++; 
		}
		n = num;
		
		while (n != 0) {
	       remainder = n % 10;
	       result += Math.pow(remainder, cnt);
	       n /= 10;
	    }

	    if (result == num)
	    	System.out.println("Given num is armstrong number");
		else
			System.out.println("Given num is not an armstrong number");
	}

}
