package febevaluation;
import java.util.*;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println(subsets(arr));
	}

	public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
		find(0 , nums , new ArrayList<Integer>() , list);
		return list;
    }

    public static void find(int index , int[] nums , List<Integer> ds , List<List<Integer>> list) {
		if(index == nums.length) {
			list.add(new ArrayList<>(ds));
			return;
		}
		ds.add(nums[index]);
		find(index + 1 , nums , ds , list);
		ds.remove(ds.size() - 1);
		find(index + 1 , nums , ds , list);
	}
}
