import java.util.*;

public class Zsgs8{

    int count1 = 0;
    static int count2; // static variable

    public static void main(String[] args){

        Zsgs8.alter();

        Zsgs8 obj1 = new Zsgs8();
        Zsgs8 obj2 = new Zsgs8();
        Zsgs8 obj3 = new Zsgs8();

        Zsgs8.Zsg8.display();

    }

    // static variable functionality
    Zsgs8(){
        count1++;
        count2++;
        System.out.println(count1 + " , " + count2);
    }

    // static method functionality
    static void alter(){
        count2 = 1; // changing the value of static variable
    }

    // static block functionality
    static{
        count2 = 0; // initializing static variable
        System.out.println("static block executed");
    }

    // static nested class functionality
    static class Zsg8{
        public static void display(){
            System.out.println("Static nested class executed");
        }
    }
}