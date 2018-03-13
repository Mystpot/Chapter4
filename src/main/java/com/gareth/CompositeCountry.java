package com.gareth;

public class CompositeCountry {

    private CountryDetails details;
    private Nationality nationality;

    CompositeCountry()
    {

    }

    CompositeCountry(CountryDetails details, Nationality nationality)
    {
        this.details = details;
        this.nationality = nationality;
    }

    public String toString()
    {
        return(details.toString() + " " + nationality.toString());
    }
}

