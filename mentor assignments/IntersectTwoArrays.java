package practiceprogramms;

import java.util.*;

public class IntersectTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,1,3,9,4,6,8,10};

		HashSet<Integer> h = new HashSet<>();
		
		for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                	h.add(arr1[i]);
                    break;
                }
            }
        }
		
		System.out.println(h);
	}

}
