package practiceprogramms;

import java.util.Scanner;

public class RemoveWithoutReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String result = "", str = sc.nextLine();
		
		for(int i=0;i<str.length();i++) 
			if(str.charAt(i) != ' ')
				result += str.charAt(i);
		
		System.out.println(result);
	}

}
