package com.gareth;

public class CountryDetails {

    private String name;
    private String currency;
    private int foundedYear;

    CountryDetails()
    {

    }

    CountryDetails(String name, String currency, int foundedYear)
    {
        this.name = name;
        this.currency = currency;
        this.foundedYear = foundedYear;
    }

    public String toString()
    {
        return String.format("The name of this country is %s, currency is %s and it was founded in the year %s.", name, currency, foundedYear);
    }
}
