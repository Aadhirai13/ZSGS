import java.util.*;

public class Zsgs91a{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        char temp = '\0';

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if((Character.compare(arr[i],arr[j])) < 0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }

        for(char ch : arr)
            System.out.print(ch);
    }
}