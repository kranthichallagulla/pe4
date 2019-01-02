package com.stackroute;

public class ReplaceString {


    public String replace(String s,char ch1,char ch2,char ch3,char ch4)
    {

        String new_str = s.replace(ch1,ch2);
        String new_str1 = new_str.replace(ch3,ch4);
        return new_str1;
    }
}