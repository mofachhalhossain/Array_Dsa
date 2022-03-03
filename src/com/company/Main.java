package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter array length");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];

        for (int i = 0; i < l; i++) {
            System.out.println("enter Element");
            arr[i] = sc.nextInt();
        }
        for (int e:
             arr) {
            System.out.print("[ "+ e + " ]");
        }

        for (int i = 0; i < l-1; i++) {
            if(arr[i+1]<arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for (int e:
             arr) {
            System.out.println("sorted: "+ e);
        }
    }
}
