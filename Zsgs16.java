import java.util.*;

public class Zsgs16{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double root1,root2,org,comp;
        
        System.out.println("Enter a : ");
        float a = sc.nextFloat();

        System.out.println("Enter b : ");
        float b = sc.nextFloat();

        System.out.println("Enter c : ");
        float c = sc.nextFloat();

        double d = Math.pow(b,2) - 4 * a * c ;

        if(d > 0.0){
            root1 = (- b + Math.sqrt(d) ) / 2 * a ;
            root2 = (- b - Math.sqrt(d) ) / 2 * a ;
            System.out.println("Root 1 : " + root1 + " Root 2 : " + root2);
        }
        else if(d == 0.0){
            root1 = root2 = - b / 2 * a ;
            System.out.println("Root 1 : " + root1 + " Root 2 : " + root2);
        }
        else{
            org = - b / 2 * a ;
            comp = Math.sqrt(d) / 2 * a ;
            System.out.println("Root 1 : " + org + " + i " + comp);
            System.out.println("Root 1 : " + org + " - i " + comp);
        }

    }
}