package midjan;

import java.util.HashMap;

public class FindSuperStrings {
	
	static HashMap<Character,Integer> h = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] X = {"ceo","alco","caaeio","ceai"};
		String[] Y = {"ec","oc","ceo"};
		String y = "",str = "";
		int count = 0;
		
		for(String s : Y)
			y += s;
		for(char ch : y.toCharArray())
			if(str.indexOf(ch) == -1)
				str += ch;
		
		for(int i=0;i<X.length;i++) {
			if(findSprStr(X[i] , str))
				count++;
		}
		System.out.println(count);
	}
	public static boolean findSprStr(String str , String perm) {
		for(int i=0;i<perm.length();i++) {
			if(str.indexOf(perm.charAt(i)) == -1)
				return false;
		}
		return true;
	}
	
}
