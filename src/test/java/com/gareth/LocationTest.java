package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocationTest {

    Location locc;

    @Before
    public void setUp() throws Exception {

        locc = new Location("North America");
    }

    @Test
    public void details() {

        assertEquals("This country is patriotic, found on the continent of North America", locc.details());
    }
}