package com.zsgs.febendevaluation;

import java.util.Arrays;

public class SplitArray {
    public static void main(String args[]){
//        int input[] = {1 , 6 , 2 , 5 , 4};
//        for(int i = 1;i < input.length;i++){
//            int first[] = Arrays.copyOfRange(input,0,i);
//            int last[] = Arrays.copyOfRange(input,i,input.length);
//            int firstSum = Arrays.stream(first).sum();
//            int lastSum = Arrays.stream(last).sum();
//            if(firstSum == lastSum){
//                System.out.println(Arrays.toString(first));
//                System.out.println(Arrays.toString(last));
//                break;
//            }
//        }

        int input1[] = {5,1};
        if(Arrays.stream(input1).sum()%2 != 0){
            System.out.println("Can't split");
            return;
        }
        for(int i = 0;i < input1.length;i++){
            for(int j = 0;j < input1.length;j++){
                if(i != j) {
                    swapElement(i, j, input1);
                    if (checkSum(input1))
                        return;
                }
            }
        }
        System.out.println("Invalid");
    }

    private static boolean checkSum(int[] input1) {
        boolean found = false;
        for(int i = 1;i < input1.length;i++){
            int first[] = Arrays.copyOfRange(input1,0,i);
            int last[] = Arrays.copyOfRange(input1,i,input1.length);
            int firstSum = Arrays.stream(first).sum();
            int lastSum = Arrays.stream(last).sum();
            if(firstSum == lastSum){
                System.out.println(Arrays.toString(first));
                System.out.println(Arrays.toString(last));
                found = true;
                break;
            }
        }
        return found;
    }

    private static void swapElement(int i, int j, int[] input1) {
        int temp = input1[i];
        input1[i] = input1[j];
        input1[j] = temp;
    }
}
