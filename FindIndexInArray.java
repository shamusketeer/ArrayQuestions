package com.company;

import java.util.Scanner;

public class FindIndexInArray {
    public static void FindIndexArray(int arr[], int k){
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            if (arr[i]==k){
                System.out.print(i+" ");
                break;
            }
        }
        for (int i = n-1; i>0 ; i--) {
            if (arr[i]==k){
                System.out.print(i+" ");
                break;
            }
        }
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
        int[] arr = takeInput();
        Scanner s= new Scanner(System.in);
        int k=s.nextInt();
        FindIndexArray(arr,k);
    }
}
