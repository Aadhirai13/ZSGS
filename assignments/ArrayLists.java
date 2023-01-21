package assignments;

public class ArrayLists {

	static int index=-1,initialCapacity = 5,additionalCapacity = 0;
	static int arr[] = new int[initialCapacity];
	
	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
			insert(i);
		delete(10);
		print();
	}
	
	public static void insert(int item) {
		index++;
		if(index==arr.length) {
			int temp[] = arr;
			additionalCapacity += 5;
			arr = new int[initialCapacity+additionalCapacity];
			for(int i=0;i<temp.length;i++)
				arr[i]=temp[i];
		}
		arr[index] = item;
	}
	
	public static void delete(int item) {
		for(int i=0;i<arr.length;i++)
			if(arr[i]==item)
				arr[i] = 0;
	}
	public static void print() {
	for(int n : arr)
		System.out.print(n + " ");
	}
}
