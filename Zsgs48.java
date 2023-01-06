import java.util.*;

public class Zsgs48{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();

        for(int row = 1;row<=n;row++) {
			for(int space=1;space<=n-row;space++) {
				System.out.print("  ");
			}
			for(int col=row;col>=1;col--){
				System.out.print((n-col+1) + " ");
			}
			for(int col=2;col<=row;col++){
				System.out.print((n-col+1) + " ");
			}
			System.out.println();
		}
    }
}
