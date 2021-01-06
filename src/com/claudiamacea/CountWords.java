package com.claudiamacea;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        String str;
        HashMap <String,Integer> words = new HashMap<>();

        System.out.println("Introduceti stringul: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();


        words = new CountWords().countWords(str);

        for(Map.Entry entry:words.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public HashMap<String,Integer> countWords(String str){
        if(str==null){
            return null;
        }
        String[] input;
        HashMap <String,Integer> words = new HashMap<>();

        input = str.split(" ");
        for(String s:input)
        {
            if (words.containsKey(s)) {
                words.put(s, words.get(s) + 1);
            } else {
                words.put(s, 1);
            }
        }
        return words;
    }
}
