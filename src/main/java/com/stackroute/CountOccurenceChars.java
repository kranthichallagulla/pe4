package com.stackroute;

public class CountOccurenceChars {

    public int countOfChars(String s,char c){
       String str = s.toLowerCase();
       // c = str.toLowerCase().charAt(0);
        int charcount = str.length() - str.replaceAll("a","").length();
       // int cn = str.length() - str.replaceAll(String.valueOf(c), "").length();
       // System.out.println(c + " occurs " + cn + " times in:\n " + str);
        return charcount;


    }


    }

