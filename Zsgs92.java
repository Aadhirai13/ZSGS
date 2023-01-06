import java.util.*;

public class Zsgs92{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        recursionSort(arr,arr.length);
    }

    public static void recursionSort(String[] s,int len){
        if(len > 0){
            for(int i=0;i<len;i++){
                if(!(s[i].compareTo(s[len-1]) == -1)){
                    String temp = s[i];
                    s[i] = s[len-1];
                    s[len-1] = temp;
                }
            }
            recursionSort(s,len-1);
        }
        if(len == 0)
            for(String str : s)
                System.out.println(str);
    }
}
