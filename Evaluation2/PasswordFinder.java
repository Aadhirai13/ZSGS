package febevaluation;
import java.util.*;

public class PasswordFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no of users : ");
//		int n = sc.nextInt();
//		System.out.println("Enter " + n + " passwords :");
		
		
		String str = "because can do must we what ";
		String pswd = "wedowhatwemustbecausewecan";
		String[] arr = new String[6];
		int k = 0;
		String temp = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ')
				temp += str.charAt(i);
			else {
				arr[k] = temp;
				k++;
				temp = "";
			}
		}
		
		List<String> passwords = new ArrayList<>(Arrays.asList(arr));
		String[] result = new String[1];
		findPassword(passwords , result , pswd , pswd.length());
	}

	public static void findPassword(List<String> list , String[] result , String s , int len) {
		boolean[] bool = new boolean[len+1];
		bool[0] = true;
		String ans = "";
		for(int i = 1;i <= len;i++) {
			for(int j = 0;j < i;j++) {
				String t = s.substring(j,i);
				if(bool[j] && list.contains(t)) {
					bool[i] = true;
					ans += t + " ";
				}
			}
		}
		if(bool[len])
			System.out.println(ans);
		else
			System.out.println("WRONG PASSWORD");
	}
}
