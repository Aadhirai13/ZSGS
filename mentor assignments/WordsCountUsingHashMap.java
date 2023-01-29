package practiceprogramms;
import java.util.*;

public class WordsCountUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> h = new HashMap<>();
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String[] arr = str.split("\\s");
		int count = 0;
		
		for(String s : arr ) {
			if(h.containsKey(s))
				h.put(s, h.get(s) + 1);
			else
				h.put(s, 1);
		}
		
		for(Map.Entry<String,Integer> entry : h.entrySet())
			count += entry.getValue();
		
		System.out.println("String contains " + count + " words");
	}

}
