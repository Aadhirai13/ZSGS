package com.zsgs.febendevaluation;

import java.util.Arrays;

public class MileageSort {
    public static void main(String args[]){
        int bikes = 3;
        String[] bikeNames = {"bike1" , "bike2" , "bike3"};
        int[] kms = {70 , 80 , 80};
        int[] fuel = {2 , 2 , 3};
        int[] mileage = new int[bikes];

        for(int i = 0;i < bikes;i++){
            mileage[i] = calcMileage(kms[i],fuel[i]);
        }

        for(int i = 0;i < bikes;i++){
            for(int j = i+1;j < bikes;j++){
                if(mileage[i] > mileage[j]){
                    swap(i,j,bikeNames,kms,fuel,mileage);
                }
            }
        }

        System.out.println(Arrays.toString(bikeNames));
    }

    private static int calcMileage(int km, int fuel) {
        return km/fuel;
    }

    private static void swap(int i , int j, String[] bikeNames, int[] kms, int[] fuel, int[] mileage){
        int tempMileage = mileage[i]; String tempBikeName = bikeNames[i]; int tempKm = kms[i]; int tempFuel = fuel[i];
        mileage[i] = mileage[j]; bikeNames[i] = bikeNames[j]; kms[i] = kms[j]; fuel[i] = fuel[j];
        mileage[j] = tempMileage; bikeNames[j] = tempBikeName; kms[j] = tempKm; fuel[j] = tempFuel;
    }
}
