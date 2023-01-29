package practiceprogramms;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		boolean prime = true;
		
		for(int i = 2;i<Math.sqrt(num);i++) {
			if(num % i == 0) {
				prime = false;
				break;
			}
		}
		if(prime)
			System.out.println("Given num is prime");
		else
			System.out.println("Given num is not prime");

	}

}
