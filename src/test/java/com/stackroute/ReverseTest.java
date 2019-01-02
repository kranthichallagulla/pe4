package com.stackroute;

import org.junit.*;
import static org.junit.Assert.*;

public class ReverseTest {
    Reverse rev = new Reverse();

    @Test

    public void test1(){
        String result = rev.reverse("Welcome to BeginnersBook");
        assertEquals("emocleW ot kooBsrennigeB ", result);

    }

    @Test
    public void Test2(){
        String result = rev.reverse("This is an easy Java Program");

        assertEquals("sihT si na ysae avaJ margorP  ", result);

        assertEquals("sihT si na ysae avaJ margorP ", result);

    }
}
