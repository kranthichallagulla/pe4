package com.stackroute;
import org.junit.Test;
import static  org.junit.Assert.*;

public class OccurenceTest {
    Occurence obj = new Occurence();
    @Test
    public void checkOccurence()
    {
        String result  = obj.check("She sells seashells by the seashore","se");
        assertEquals("Found at:4 - 6 Found at:10 - 12 Found at:27 - 29",result);

    }
    @Test
    public void checkOccurence1()
    {
        String result  = obj.check("She sells seashells by the seashore   ","ls");
        assertEquals("Found at:7 - 9 Found at:17 - 19 ",result);
    }
    @Test
    public void checkOccurence2()
    {
        String result  = obj.check("She sells seashells by the seashore   ","se");
        assertNotEquals("Found at:4 - 10 Found at:11 - 12 Found at:27 - 29",result);
    }
}
