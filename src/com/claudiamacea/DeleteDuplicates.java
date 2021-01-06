//{1,2,2,3,4,4,4,5,5} - > {1,2,3,4,5,0,0,0,0}
//{1,2,5,4,1,6,7,1} -> se elimina 1 - > {2,5,4,6,7,7,7} + afisare ca  1 apare 2 ori
package com.claudiamacea;

import java.util.*;

public class DeleteDuplicates {

    public static void main(String[] args) {

        int count,n,countTotal=0;
        int[] array;
        Scanner s = new Scanner(System.in);
        System.out.println("Lungimea arrayului: ");
        n = s.nextInt();
        array = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("array[" + i + "] = ");
            array[i] = s.nextInt();
        }

        DeleteDuplicates test = new DeleteDuplicates();
        test.deleteIndices(array,1);

    }

    public static void printArray(int[] array){
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }

        System.out.println();
    }

    public void withoutDuplicates(int[] array){
        int count = 1;
        DeleteDuplicates.printArray(array);
        for(int i=1;i<array.length;++i){
            if(array[count-1]!=array[i])
                array[count++]=array[i];
        }
        for(int i=count;i<array.length;i++){
            array[i]=0;
        }
        DeleteDuplicates.printArray(array);
    }
    //2123133345 - 1 -->sterge toate elementele cu valoare 1
    public void deleteIndices(int[] array, int x){
        int count=0;
        DeleteDuplicates.printArray(array);
        for(int i =0;i<array.length;i++)
            if(array[i]!=x){
                array[count]=array[i];
                count++;
            }
        DeleteDuplicates.printArray(array);
        System.out.println("Elemente diferite de " + x + " sunt " + count);
    }

}
