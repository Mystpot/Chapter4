package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountryDetailsTest {

    CountryDetails count;

    @Before
    public void setUp() throws Exception {

        count = new CountryDetails("USA", "Dollar", 1776);
    }

    @Test
    public void testtoString() {
        assertEquals("The name of this country is USA, currency is Dollar and it was founded in the year 1776.", count.toString());
    }
}