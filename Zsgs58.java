import java.util.*;

public class Zsgs58{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();

        for(int row = 1;row<=n;row++) {
			for(int col=1;col<=2*n;col++){
				if(col<=n-row+1 || col>=n+row )
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
		for(int row = 1;row<=n;row++) {
			for(int col=1;col<=2*n;col++){
				if(col<=row || col>=2*n-row+1 )
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
    }
}
