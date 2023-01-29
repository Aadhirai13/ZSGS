package practiceprogramms;

import java.util.*;

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Integer> h = new HashMap<>();
		int[] arr = {1,2,3,4,5,6};
		
		for(int s : arr ) {
			if(h.containsKey(s))
				h.put(s, h.get(s) + 1);
			else
				h.put(s, 1);
		}
		
		// for loop
		System.out.println("simple for loop");
		for(Map.Entry<Integer,Integer> entry : h.entrySet())
			System.out.print(entry.getKey() + "-" + entry.getValue() + " , ");
		
		// enhanced for loop
		System.out.println("\n\nenhanced for loop");
		h.forEach((Integer key,Integer value) -> System.out.print(key + "-" + value + " , "));
		
		// while loop
		System.out.println("\n\nwhile loop");
		Iterator <Integer> k = h.keySet().iterator();
		while (k.hasNext()) {
			int key = (int)k.next();  
			System.out.print(key + "-" + h.get(key) + " , "); 
		}
			
	}

}
