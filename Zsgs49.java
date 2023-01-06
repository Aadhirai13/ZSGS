import java.util.*;

public class Zsgs49{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();

        for(int row = 1;row<=n;row++) {
			for(int space=1;space<=row-1;space++) {
				System.out.print(" ");
			}
			
			for(int col=1;col<=n-row+1;col++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
    }
}
