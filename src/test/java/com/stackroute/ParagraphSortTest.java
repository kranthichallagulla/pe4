package com.stackroute;
import java.lang.String;
import org.junit.Test;
import static org.junit.Assert.*;


public class ParagraphSortTest {
        ParagraphSort p = new ParagraphSort();

        @Test
        public void para() {
            String[] result= p.sortpara(new String[]{"Java is a programming language." +
                    "Java is used to develop mobile apps, web apps, desktop apps, games and much more."});
            assertArrayEquals(new String[]{"a  and apps apps apps desktop develop games is is Java Java language mobile more much programming to used web "},result);
        }

        @Test
        public void para1() {
            String[] result = p.sortpara(new String[] {"bunny anil leela rishi chris sandeep"});
            assertArrayEquals(new String[]{"anil bunny chris leela rishi sandeep "},result);
        }

    @Test
    public void para2() {
        String[] result = p.sortpara(new String[] {"bunny anil leela rishi chris sandeep"});
        assertNotEquals(new String[]{"anil sandeep leela  chris rishi bunny "},result);
    }
    }
