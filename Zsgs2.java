import java.util.*;

public class Zsgs2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toUpperCase(ch);
        for(int i=ch;i<=90;i++)
            System.out.print((char)i);

        // to print both lowecase an uppercase
        // char ch = sc.next().charAt(0);
        // if(Character.isUpperCase(ch)){
        //     for(int i=ch;i<=90;i++)
        //         System.out.print((char)i);
        // }
        // else{
        //     for(int i=ch;i<=122;i++)
        //         System.out.print((char)i);
        // }
    }
}