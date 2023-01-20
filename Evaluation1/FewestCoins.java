package midjan;
import java.util.*;

public class FewestCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] denom = {1,2,5,10};
		int[] coins = new int[4];
		for(int i=0;i<denom.length;i++) {
			System.out.println("Enter no.of.coins in " + denom[i] + " : ");
			coins[i] = sc.nextInt();
		}
		
		System.out.println("Enter amount : ");
		int i , amnt = sc.nextInt();
		outer:
		while(amnt != 0) {
			for(i=denom.length-1;i>=0;i--) {
				if(denom[i] > amnt)
					continue;
				else {
					if(coins[i] < (amnt/denom[i])) {
						System.out.println(denom[i] + " - " + coins[i]);
						amnt -= (coins[i] * denom[i]);
						coins[i] = 0;
					}
					else {
						System.out.println(denom[i] + " - " + (amnt/denom[i]));
						coins[i] -= (amnt/denom[i]);
						amnt -= ((amnt/denom[i]) * denom[i]);
					}
				}
				if(i == 0 && amnt != 0) {
					System.out.println("Insuffiecient balance");
					break outer;
				}
			}			
		}			
	}
	
}
