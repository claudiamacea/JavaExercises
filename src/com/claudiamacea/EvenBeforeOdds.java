package com.claudiamacea;

import java.util.Scanner;

public class EvenBeforeOdds {
    public static void main(String[] args) {
        int [] array;
        int nextEven = 0,nextOdd,temp;

        Scanner s = new Scanner(System.in);
        System.out.println("n = ");
        int n = s.nextInt();
        array = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("i = ");
            array[i]=s.nextInt();
        }

        for(int i:array)System.out.print(i + " ");
        System.out.println();

        nextOdd=n-1;
        while(nextEven<nextOdd){
            if(array[nextEven]%2==0){
                nextEven++;
            }else{
                temp = array[nextOdd];
                array[nextOdd]=array[nextEven];
                array[nextEven]=temp;
                nextOdd--;
            }
        }

        for(int i:array)System.out.print(i + " ");
    }
}
