package practiceprogramms;

import java.util.*;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = {1,2,3,4,5,6};
		
		for(int num : arr ) 
			list.add(num);
		
		// for loop
		System.out.println("simple for loop");
		for(Integer n : list) 
			System.out.print(n + " , ");
		
		// enhanced for loop
		System.out.println("\n\nenhanced for loop");
		list.forEach((Integer n) -> System.out.print(n + " , "));
		
		// while loop
		System.out.println("\n\nwhile loop");
		ListIterator <Integer> n = list.listIterator();
		while (n.hasNext()) 
			System.out.print(n.next() + " , "); 
	}

}
