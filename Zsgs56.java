import java.util.*;

public class Zsgs56{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int num = 1, n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=(n-row);space++){
                System.out.print(" ");
            }

            for(int col=1;col<=row;col++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}