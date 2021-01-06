package com.claudiamacea;

//replace a character with another character from a string
//I created two methods : Iteration + Recursivity

import java.util.Scanner;

public class ReplaceString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti stringul: ");
        String str = sc.nextLine();
        System.out.println("Introduceti caracterul ce va fi inlocuit: ");
        char from = sc.next().charAt(0);
        System.out.println("Introduceti caracterul cu care se va fi inlocui: ");
        char to = sc.next().charAt(0);

        String neww = new ReplaceString().replaceRec(str,from,to);
        System.out.println(neww);
    }

    public String replace(String str, char from, char to){
        StringBuilder newString = new StringBuilder();
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)==from) {
                newString.append(Character.toString(to));
            }else {
                newString.append(Character.toString(str.charAt(i)));
            }
        return newString.toString();
    }

    public String replaceRec(String str, char from, char to) {
        if(str.length()<1){
            return str;
        }else{
            char first;
            if(str.charAt(0)==from) first = to;
            else first = str.charAt(0);
            return first + replaceRec(str.substring(1),from,to);
        }

    }

}
