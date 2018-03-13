package com.gareth;

public class Country extends Location implements LandMass {

    private String name;
    private String currency;
    private int foundedYear;
    private String nationalAnimal;
    private String mainLanguage;

    Country()
    {

    }

    Country(String name, String currency, int foundedYear, String nationalAnimal, String mainLanguage)
    {
        this.name = name;
        this.currency = currency;
        this.foundedYear = foundedYear;
        this.nationalAnimal = nationalAnimal;
        this.mainLanguage = mainLanguage;
    }

    Country(String name, String currency, int foundedYear,String nationalAnimal, String mainLanguage, String continent)
    {
        this.name = name;
        this.currency = currency;
        this.foundedYear = foundedYear;
        this.nationalAnimal = nationalAnimal;
        this.mainLanguage = mainLanguage;
        this.continent = continent;
    }

    public String getName()
    {
        return name;
    }

    public String getCurrency()
    {
        return currency;
    }

    public int getFoundedYear()
    {
        return foundedYear;
    }

    public String getNationalAnimal()
    {
        return nationalAnimal;
    }

    public String getMainLanguage()
    {
        return mainLanguage;
    }

    public String toString()
    {
        return String.format("The name of this country is %s, currency is %s and it was founded in the year %d. The national animal is %s and the main language is %s", name, currency, foundedYear, nationalAnimal, mainLanguage );
    }
}
