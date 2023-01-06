import java.util.*;

public class Zsgs93{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        System.out.println(recursionSort(str));
    }

    public static String recursionSort(String s){
        int pos = 0;
        char max = s.charAt(0);

        if(s.length()<2)
            return s;

        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if((Character.compare(max,ch)) < 0){
                max = ch;
                pos = i;
            }
        }
        return max + recursionSort(s.substring(0,pos) + s.substring(pos+1));
    }
}