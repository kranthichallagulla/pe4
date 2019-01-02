package com.stackroute;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountOccurenceCharsTest {
    CountOccurenceChars coc=new CountOccurenceChars();
    @Test
    public void occurenceTest(){
        int result=coc.countOfChars("Stack route training program",'a');
        assertEquals(3,result);
    }
    @Test
    public void occurenceTestfail(){
        int result=coc.countOfChars("ibm manyata tech park",'i');
        assertNotEquals(2,result);
    }
}
