import java.util.*;

public class Zsgs47{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int n = sc.nextInt();

        for(int row = 1;row<=n;row++) {
			for(int space=1;space<=n-row;space++) {
				System.out.print("  ");
			}
			for(int col=1;col<=row;col++){
				System.out.print(col + " ");
			}
			for(int col=row-1;col>=1;col--){
				System.out.print(col + " ");
			}
			System.out.println();
		}
    }
}
