package practiceprogramms;

import java.util.Scanner;

public class RemoveUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		str = str.replaceAll("\\s", "");
		System.out.println(str);

	}

}
