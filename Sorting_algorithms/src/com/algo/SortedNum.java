package com.algo;

import java.util.Arrays;

public class SortedNum {
    public static void bubbleSort(int[] array){
        for(int i = array.length; i > 0; i--){
            for(int j = 1; j < i; j++){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] num = new int[] {12, 3, 43, 10, 1, -23, 90, 13};
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
}
