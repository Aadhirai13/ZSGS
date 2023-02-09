package febevaluation;
import java.util.*;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		int[] num = new int[n];
		String[] str = new String[n];
		Map<Integer,Queue<String>> m = new TreeMap<>();
		
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
			str[i] = sc.next();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(num[i] + " " + str[i]);
		}
		
		for(int i=0;i<n;i++) {
			if(i < n/2)
				str[i] = "-";
			if(m.containsKey(num[i])) {
				Queue<String> q1 = m.get(num[i]);
				q1.add(str[i]);
				m.put(num[i], q1);	
			}
			else {
				Queue<String> q = new LinkedList<>();
				q.add(str[i]);
				m.put(num[i], q);
			}
		}
		String result = "";
		
		for(Map.Entry<Integer, Queue<String>> entry : m.entrySet()) {
			while(entry.getValue().size() != 0) {
				result += entry.getValue().peek() + " ";
				entry.getValue().poll();
			}
		}
		System.out.println(result);
		
	}

}
