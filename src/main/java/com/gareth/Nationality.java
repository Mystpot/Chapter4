package com.gareth;

public class Nationality {

    private String nationalAnimal;
    private String mainLanguage;

    Nationality()
    {

    }

    Nationality(String nationalAnimal, String mainLanguage)
    {
        this.nationalAnimal = nationalAnimal;
        this.mainLanguage = mainLanguage;
    }

    public String toString()
    {
        return String.format("The national animal is %s and the main language is %s.", nationalAnimal, mainLanguage);
    }
}
