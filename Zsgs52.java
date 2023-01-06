import java.util.*;

public class Zsgs52{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        System.out.println(reverseString(arr,arr.length));
    }

    public static String reverseString(String s[],int n){
        if(n==1)
            return s[0];
        
        String result[]=new String[n-1];
        for(int i=0;i<result.length;i++){
            result[i]=s[i];
        }
        return s[n-1] +" "+ reverseString(result,result.length);
    }
}