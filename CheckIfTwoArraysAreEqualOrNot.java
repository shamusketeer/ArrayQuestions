package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfTwoArraysAreEqualOrNot {

    public static void CheckTwoArraysAreEqualOrNot(int[] arr1, int[] arr2){
        int n= arr1.length;
        int m =arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (m!=n)
            System.out.println("Not Found");
        for (int i = 0; i <n ; i++) {
                    if (arr1[i]!=arr2[i])
                        System.out.println("Not Found");;
        }
        System.out.println("Both array are same");
    }

    public static int []takeInput(){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int []input =new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args) {
        int[] arr1 = takeInput();
        int[] arr2 = takeInput();
        CheckTwoArraysAreEqualOrNot(arr1,arr2);
    }
}
