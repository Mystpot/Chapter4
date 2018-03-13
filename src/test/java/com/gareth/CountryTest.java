package com.gareth;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountryTest {

    Country sa;

    @Before
    public void setUp() throws Exception {

    sa = new Country("South Africa", "Rand", 1804, "Springbok", "English");
    }



    @Test
    public void getName() {

        assertEquals("South Africa", sa.getName());
    }


    @Test
    public void getCurrency() {

        assertEquals("Rand", sa.getCurrency());
    }

    @Test
    public void getFoundedYear() {

        assertEquals(1804, sa.getFoundedYear());
    }

    @Test
    public void getNationalAnimal() {

        assertEquals("Springbok", sa.getNationalAnimal());
    }

    @Test
    public void getMainLanguage() {

        assertEquals("English", sa.getMainLanguage());
    }

    @Test
    public void testtoString() {

        assertEquals("The name of this country is South Africa, currency is Rand and it was founded in the year 1804. The national animal is Springbok and the main language is English", sa.toString());
    }
}