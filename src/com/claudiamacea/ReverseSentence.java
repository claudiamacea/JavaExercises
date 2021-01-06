package com.claudiamacea;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduceti propozitia: ");
        String st;
        st = s.nextLine();

        System.out.println("aici incepe:" + new ReverseSentence().reverseSentence(st) + "aici se termina");

    }

    public String reverseSentence(String str){
        if(str==null){
            return str;
        }
        StringBuilder output = new StringBuilder();
        String [] input = str.split(" ");
        for(int i = input.length-1;i>=0;i--){
            output.append(input[i]);
            output.append(" ");
        }

        return output.toString().trim();
    }
}
