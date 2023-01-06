import java.util.*;

public class Zsgs55{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row == 0 || col == 0 || row == n-1)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}