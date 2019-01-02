package com.stackroute;

public class Reverse {


    public String reverse(String s) {


        String[] s1 = s.split(" ");
        String reversedString = "";
        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {

                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
            String str=reversedString.trim();
        }
             return reversedString;
    }
}


