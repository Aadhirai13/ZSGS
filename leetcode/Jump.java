package leet;

public class Jump {

	static int arr[] = {2,3,0,1,4};
	static int len = arr.length;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxJump(arr[0], 0));
	}
	public static boolean maxJump(int jump, int i) {
		if(i == len-1)
			return true;
		if(arr[i+jump] == 0 || i+jump >= len)
			return false;
		return maxJump(arr[i+jump],i+jump);
	}
}
