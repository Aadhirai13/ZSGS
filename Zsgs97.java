import java.util.*;

public class Zsgs97{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Enter char to search: ");
        char key = sc.next().charAt(0);
        int mid = 0, first=0, last = str.length()-1;

        while(first <= last){
            if(str.charAt(mid) < key)
                first = mid+1;
            else if(str.charAt(mid) > key)
                last = mid-1;
            else{
                System.out.println("Key found in the index " + mid);
                break;
            }
            mid = (first + last) / 2;
        }
        if(first > last)
            System.out.println("Key not found");
    }
}