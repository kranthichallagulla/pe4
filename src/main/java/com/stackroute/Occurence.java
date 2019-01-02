package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurence {
    public String check(String s,String s1){



        Pattern pattern = Pattern.compile(s1);
        Matcher matcher = pattern.matcher(s);

        int count = 0;
        String result="";
        while(matcher.find()) {
            count++;
            result+="Found at:"
                    + matcher.start() + " - " + matcher.end()+" ";

        }
        System.out.println(result);
        return result;

    }
}
