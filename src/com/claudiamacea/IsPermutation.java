package com.claudiamacea;

import java.util.Arrays;
import java.util.Scanner;

public class IsPermutation {

    public static void main(String[] args) {
        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean perm = true;
        if(c1.length!=c2.length) {
            perm = false;
        }else{
            for(int i=0;i<c1.length;i++){
                if(c1[i]!=c2[i])perm = false;
            }
        }

        if(perm){
            System.out.println("Este o permutare");
        }else{
            {
                System.out.println("Nu este o permutare");
            }
        }
    }
}
