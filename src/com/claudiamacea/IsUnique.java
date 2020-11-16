package com.claudiamacea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class IsUnique {
    public static void main(String[] args) throws IOException {
        //Scanner s = new Scanner(System.in);
        //String test=s.nextLine();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String test = bf.readLine();

        IsUnique unique = new IsUnique();
        if(unique.verifyUniqueNew(test)){
            System.out.println("Stringul \"" + test + "\" contine numai caractere unice");
        }else{
            System.out.println("Stringul " + test + " nu contine numai caractere unice");
        }
    }

    public boolean verifyUnique(String test){
        boolean isUnique = true;
        for(int i=0;i<test.length();i++){
            for(int j=i+1;j<test.length();j++){
                char c1 = test.charAt(i);
                char c2 = test.charAt(j);
                if(Character.compare(c1,c2)==0){
                    isUnique = false;
                }
            }
        }
        return isUnique;
    }

    public boolean verifyUniqueNew(String test){
        LinkedHashSet<Character> newTest = new LinkedHashSet<Character>();
        for (char c:test.toCharArray()){
            newTest.add((Character)c);
        }
        if(newTest.size()==test.length()){
            return true;
        }else{
            return false;
        }
    }
}
