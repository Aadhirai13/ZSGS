package practiceprogramms;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int i = 0 , j = str.length()-1;
		char[] arr = str.toCharArray();
		String revStr = "";
		
		while(i<j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for(char ch : arr)
			revStr += ch;
		System.out.println("Reversed String : " + revStr);
	}

}
