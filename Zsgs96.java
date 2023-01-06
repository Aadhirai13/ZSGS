import java.util.*;

public class Zsgs96{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Enter char to search: ");
        char key = sc.next().charAt(0);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == key){
                System.out.println("Key found in the index : " + i);
                break;
            }
        }
    }
}