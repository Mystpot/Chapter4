package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NationalityTest {

    Nationality natt;

    @Before
    public void setUp() throws Exception {

        natt = new Nationality("Penguin", "German");
    }

    @Test
    public void testtoString() {
        assertEquals("The national animal is Penguin and the main language is German.", natt.toString());
    }
}