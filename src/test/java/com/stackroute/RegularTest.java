package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegularTest {
    Regular r = new Regular();

    @Test
    public void regtest() {
        String result = r.regular("This is Harry");
        assertEquals("is Harry Here? true", result);
    }

    @Test
    public void regtest1() {
        String result = r.regular("This is Henry");
        assertEquals("is Harry Here? false", result);
    }
}