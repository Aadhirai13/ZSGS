package midjan;
import java.util.*;

public class ExpressionEvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		System.out.println("Enter expression : ");
		String exp = "" , str = sc.nextLine();
		char arr[] = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == '(')
				s.push(arr[i]);
			else if(arr[i] == ')') {
				if(evaluateExpression(exp)) {
					exp = "";
					if(s.isEmpty() || (char)s.pop() != '(') {
						System.out.println("Invalid");
						break;
					}
				}
			}
			else {
				exp += arr[i];
			}
		}
		if(!(s.isEmpty()))
			System.out.println("Invalid");
		else
			System.out.println("Valid");
	}
	
	public static boolean evaluateExpression(String s) {
		boolean isValid = true;
		int letter = 0,operator = 0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i)))
				letter++;
			else
				operator++;
		}
		if(letter != operator+1) {
			isValid = false;
		}
		for(int i=0;i<s.length();i=i+2) {
			if(!(Character.isLetter(s.charAt(i))))
				isValid = false;
		}
		
		for(int i=1;i<s.length();i = i+2) {
			if((Character.isLetter(s.charAt(i))))
				isValid = false;
		}
			
		return isValid;
	}

}
