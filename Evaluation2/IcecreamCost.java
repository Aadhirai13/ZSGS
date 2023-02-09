package febevaluation;
import java.util.Arrays;
import java.util.Scanner;

public class IcecreamCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of flavours : ");
		int n = sc.nextInt();
		int cost[] = new int[n];
		for(int i=0;i<n;i++)
			cost[i] = sc.nextInt();
		System.out.println("Enter money : ");
		int money = sc.nextInt();
		
		findFlavours(n , cost , money);
	}

	public static void findFlavours(int n , int[] cost , int money) {
		boolean bool = false;
		Arrays.sort(cost);
		int i = 0 , j = n-1;
		while(i<=n-1 && j>=0) {
			if(i == j)
				i++;
			else if(cost[i] + cost[j] == money) {
				bool = true;
				break;
			}
			else if(cost[i] + cost[j] < money) 
				i++;
			else
				j--;
		}
		if(bool)
			System.out.println("Cost of flavours : " + cost[i] + " & " + cost[j] + "\nIndices are : " + (i+1) + " & " + (j+1));
		else
			System.out.println("They didn't have enough money");
	}
}
