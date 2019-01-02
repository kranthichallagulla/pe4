package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceStringTest {
    ReplaceString repstr = new ReplaceString();

    @Test
    public void replace() {
        String result = repstr.replace("daily dry",'d','f','l','t');
        assertEquals("faity fry", result);
    }


    @Test
    public void replace1() {
        String result = repstr.replace("Aloo fry",'o','u','f','d');
        assertEquals("Aluu dry", result);
    }


    @Test
    public void replaceFail()
    {
        String result = repstr.replace("daily dry",'d','f','l','t');
        assertNotEquals("faily fry", result);
    }
}