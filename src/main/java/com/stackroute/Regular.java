package com.stackroute;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regular {
    public boolean regular(String s)
    {

         String REGEX = "Harry";
         Pattern p = Pattern.compile(REGEX);
         Matcher m = p.matcher(s);

        return Pattern.compile(REGEX).matcher(s).find();
    }
}