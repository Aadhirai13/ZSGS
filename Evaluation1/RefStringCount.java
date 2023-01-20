package midjan;
import java.util.*;

public class RefStringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string ");
		String str = sc.nextLine();
		System.out.println("Enter reference string ");
		String refStr = sc.nextLine();
		findCount(str.toLowerCase() ,refStr.toLowerCase());
	}
	
	public static void findCount(String str,String refStr) {
		HashMap<Character,Integer> h = new HashMap<>();
		char[] arr = str.toCharArray();
		for(char ch : arr) {
			if(h.containsKey(ch))
				h.put(ch, h.get(ch) + 1);
			else
				h.put(ch, 1);
		}
		outer:
		for(int i=0;i<refStr.length();i++) {
			for(Map.Entry<Character,Integer> entry : h.entrySet()) {
				if(entry.getKey() == refStr.charAt(i)) {
					if(i == refStr.length() - 1)
						System.out.print(entry.getKey() + ":" + entry.getValue());
					else
						System.out.print(entry.getKey() + ":" + entry.getValue() + ",");
					continue outer;
				}
			}
		}
	}

}
