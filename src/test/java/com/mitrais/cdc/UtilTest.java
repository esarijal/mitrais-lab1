package com.mitrais.cdc;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void reverseTestSucceed(){
        assertEquals("!dlroW olleH", Util.reverse("Hello World!"));
    }

    @Test
    public void reverseTestCaseSensitive(){
        String result = Util.reverse("bandung");
        assertNotEquals("GNUDNAB", result);
    }

    @Test
    public void intToBinarySucceed(){
        assertEquals(Integer.toString(20,2), Util.intToBinary(20));
        assertEquals(Integer.toString(19,2), Util.intToBinary(19));
        assertEquals(Integer.toString(30,2), Util.intToBinary(30));
        assertEquals(Integer.toString(43,2), Util.intToBinary(43));
        assertEquals(Integer.toString(29,2), Util.intToBinary(29));
    }

}