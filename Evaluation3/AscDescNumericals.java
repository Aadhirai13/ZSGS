package com.zsgs.febendevaluation;

import java.util.ArrayList;
import java.util.Arrays;

public class AscDescNumericals {
    static public void main(String args[]){
        int input = 19;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        AscDescNumericals obj = new AscDescNumericals();
        while(!obj.isPrime(++input)){
            if((input % 2) == 0)
                even.add(input);
            else
                odd.add(input);
        }

        System.out.println("Output 1");
        for(int i = 0;i < even.size();i++)
            System.out.print(even.get(i) + " ");

        System.out.println("\nOutput 2");
        for(int i = odd.size() - 1;i >= 0;i--)
            System.out.print(odd.get(i) + " ");

        print(even,"ASC");
        print(odd,"DESC");
    }

    private static void print(ArrayList<Integer> list,String order) {
        int arr[] = {1,2,3};

    }

    private boolean isPrime(int input) {
        boolean isPrime = true;
        for(int i=2;i<Math.sqrt(input);i++){
            if((input % i) == 0 ){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
