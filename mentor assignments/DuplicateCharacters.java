package practiceprogramms;
import java.util.*;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		HashMap<Character,Integer> h = new HashMap<>();
		
		for(char ch : str.toCharArray() ) {
			if(h.containsKey(ch))
				h.put(ch, h.get(ch) + 1);
			else
				h.put(ch, 1);
		}
		
		for(Map.Entry<Character,Integer> entry : h.entrySet())
			if(entry.getValue() > 1)
				System.out.print(entry.getKey() + " , ");
	}
}
