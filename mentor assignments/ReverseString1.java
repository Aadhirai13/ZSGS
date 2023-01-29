package practiceprogramms;
import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String revStr = "";
		
		for(int i = str.length()-1;i>=0;i--)
			revStr += str.charAt(i);
		
		System.out.println("Reversed String : " + revStr);
	}

}
