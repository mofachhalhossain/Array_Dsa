package com.company;

public class FindTargetOneDimention {
    public static void main(String[] args) {
        int[] arr = {32,52,12,53,22,66,80,11};
        int target = 52;
        find(arr,target);
    }

    private static void find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] == target){
                System.out.println(target+ " is present at: " + i + " position.");
                break;
            }

        }

    }
}
