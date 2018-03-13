package com.gareth;

public class Location {

    protected String continent;
    private String pride = "patriotic";


    Location()
    {

    }

    Location(String continent)
    {
        this.continent = continent;
    }

    public String details()
    {
        return String.format("This country is %s, found on the continent of %s", pride, continent);
    }

}
