import java.util.*;

public class Zsgs60{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int result = 0,n = sc.nextInt();
        for(int i=1;i<=n;i++){
            result += calc(i);
        }
        System.out.println(result);
    }

    public static int calc(int n){
        int res = 1,num = n;
        if(n != 1){
            for(int i=1;i<n;i++){
                res = res * 10 + 1;
            }
        }
        return res;
    }
}