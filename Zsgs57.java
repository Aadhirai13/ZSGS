import java.util.*;

public class Zsgs57{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int len = str.length();

        if(len % 2 == 0)
            System.out.println("Can't form pattern");
        else{
            for(int row=0;row<len;row++){
                for(int col=0;col<len;col++){
                    if((row == col))
                        System.out.print(str.charAt(row));
                    else if((row + col == len - 1))
                        System.out.print(str.charAt(col));
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

    }
}