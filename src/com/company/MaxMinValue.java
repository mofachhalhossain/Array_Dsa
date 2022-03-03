package com.company;


public class MaxMinValue {
    public static void main(String[] args) {
        int[] arr = {23,11,52,64,90,54,1,34,8};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(maxInRange(arr,2,6));
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    private static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    private static int maxInRange(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
