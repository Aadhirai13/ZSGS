import java.util.*;

public class Zsgs5{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch=Character.toUpperCase(ch);
        int t = ch,n = ch-64;
        for(int i=n;i>0;i--){
            ch = (char)t; 
            for(int j=0;j<i;j++){
                System.out.print(ch);
            }
            t--;
            System.out.println();
        }      
    }
}