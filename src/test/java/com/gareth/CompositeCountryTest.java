package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompositeCountryTest {

    CountryDetails deets;
    Nationality nat;
    CompositeCountry zim;

    @Before
    public void setUp() throws Exception {

        deets = new CountryDetails("Zimbabwe", "Dollar", 1850);
        nat = new Nationality("Antelope", "English");
        zim = new CompositeCountry(deets, nat);
    }

    @Test
    public void testtoString() {

        assertEquals("The name of this country is Zimbabwe, currency is Dollar and it was founded in the year 1850. The national animal is Antelope and the main language is English.", zim.toString());
    }
}