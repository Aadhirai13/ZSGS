package practiceprogramms;
import java.util.*;

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> h = new HashSet<>();
		Integer arr[] = {1,2,3,4,5};
		h.addAll(Arrays.asList(arr));

		Integer res[] = h.toArray(new Integer[h.size()]);
		System.out.println(Arrays.toString(res));
	}

}
