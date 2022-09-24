package com.company;

import java.util.Scanner;

public class palindromicArray {
        public static void palindromArray(int arr[]){
            int n= arr.length,ans,check=1;
            for (int i = 0; i <n ; i++) {
                //int temp =0;
                ans=0;
                int temp=arr[i];
                while (temp>0){
                    int r=temp%10;
                    ans=ans*10+r;
                  temp= temp/10;
                }
                //System.out.println(ans);
                if (arr[i]==ans){
                    check=check & 1;
                }else {
                    check=check & 0;
                }
            }
            if(check==1){
                System.out.println(1);
            }else {
                System.out.println(0);
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
            palindromArray(arr);

        }
}
