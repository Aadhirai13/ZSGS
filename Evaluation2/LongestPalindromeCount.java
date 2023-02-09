package febevaluation;
import java.util.*;

public class LongestPalindromeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("Enter lIndex and rIndex : ");
		int l = sc.nextInt();
		int r = sc.nextInt();
		char[] substr = (str.substring(l-1 , r)).toCharArray();
		
		permutations(substr);
	}

	public static void permutations(char[] substr) {
		
		Map<Integer,Integer> m = new TreeMap<>();
		Set<String> s = new HashSet<>();
		
		for(int i = 0;i<substr.length;i++) {
			for(int j=0;j<substr.length;j++) {
				String str = swap(substr , i , j);
				isPalindrome(str , m , s);
			}
		}

		int x = 0;
		
		for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
			x = entry.getValue();
		}
		System.out.println(x);
    }
	
	public static String swap(char[] arr , int i , int j) {
		String temp = "";
		char t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
		for(char c : arr)
			temp += c;
		return temp;
	}
	
	public static void isPalindrome(String substr , Map<Integer,Integer> m , Set<String> s) {
		
		int max = 0;
		for(int i = 0;i < substr.length();i++) {
			int l = substr.lastIndexOf(substr.charAt(i));
			String temp = substr.substring(i, l+1);
			int len = temp.length(); 
			StringBuilder sb = new StringBuilder(temp);
			if(temp.equals(sb.reverse().toString()) && !s.contains(temp)) {
				s.add(temp);
				if(m.containsKey(len))
					m.put(len, m.get(len)+1);
				else
					m.put(len, 1);
			}
		}
	}

}