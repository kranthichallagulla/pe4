
package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegularTest
{
    Regular r = new Regular();

    @Test
    public void regtest() {
        boolean result = r.regular("This is Harry");
        assertTrue("is Harry here? true", result);
    }

    @Test
    public void regtest1() {
        boolean result = r.regular("This is Henry");
        assertFalse("is Harry here? false", result);
    }
}