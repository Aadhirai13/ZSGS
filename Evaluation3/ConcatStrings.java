package com.zsgs.febendevaluation;

public class ConcatStrings {
    public static void main(String[] args){
        String[] inputs = {"tab" , "tabcb" , "abt"};
        int maxLen = 0;
        String resultString = "";

//        for(int i = 0;i < inputs.length;i++){
//            String currentString = inputs[i];
//            String[] temp = new String[inputs.length-1];
//            int x = 0;
//            for(int k = 0;k < inputs.length;k++){
//                if(i != k)
//                temp[x++] = inputs[k];
//            }
//            for(int j = 0;j < temp.length;j++){
//                if(!(currentString.equals(temp[j])) && (Character.toLowerCase(currentString.charAt(currentString.length()-1)) == Character.toLowerCase(temp[j].charAt(0)))){
//                    currentString += temp[j];
//                    if(currentString.length() > maxLen){
//                        resultString = currentString;
//                        maxLen = currentString.length();
//                    }
//                }
//            }
//        }

        boolean isVisited[] = new boolean[inputs.length];
        for(int i = 0;i < inputs.length;i++){
            String currentString = inputs[i];
            isVisited[i] = true;
            int j = 0;
            for(j = 0;j < inputs.length;j++){
                if(!isVisited[j] && (Character.toLowerCase(currentString.charAt(currentString.length()-1)) == Character.toLowerCase(inputs[j].charAt(0)))){
                    currentString += inputs[j];
                    isVisited[j] = true;
                    if(currentString.length() > maxLen){
                        resultString = currentString;
                        maxLen = currentString.length();
                        j = 0;
                    }
                }
            }
            isVisited = new boolean[inputs.length];
        }
        System.out.println(resultString);
    }

//    for(int j = 0;j < inputs.length;j++){
//        if(!(currentString.equals(inputs[j])) && (Character.toLowerCase(currentString.charAt(currentString.length()-1)) == Character.toLowerCase(inputs[j].charAt(0)))){
//            currentString += inputs[j];
//            inputs[j] = "";
//            if(currentString.length() > maxLen){
//                resultString = currentString;
//                maxLen = currentString.length();
//            }
//        }
//    }
}
