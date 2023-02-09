package febevaluation;

import java.util.*;

public class DivisibleByk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter value of k : ");
		int k = sc.nextInt();
		
		List<List<Integer>> list = new ArrayList<>();
		findList(0 , arr , k , new ArrayList<Integer>() , list , 0);
		System.out.println(list);
	}
	
	public static void findList(int i , int[] arr , int k , 
													List<Integer> ds , List<List<Integer>> list , int sum){
		if(ds .size() == 2) {
			if(sum / k == 1 && sum % k == 0) {
				list.add(new ArrayList<>(ds));
				return;
			}
			else
				return;
		}
		else if(i >= arr.length)
			return;
		if(ds.size() > 2)
			return;

		ds.add(arr[i]);
		findList(i+1 , arr , k , ds , list , sum + arr[i]);
		ds.remove(ds.size() - 1);
		findList(i+1 , arr , k , ds , list , sum);
	}
	

}
