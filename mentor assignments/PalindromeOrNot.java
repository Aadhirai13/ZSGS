package practiceprogramms;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		StringBuilder rev = new StringBuilder(str);
		
		if(str.equalsIgnoreCase(rev.reverse().toString()))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not a palindrome");
		
	}

}
