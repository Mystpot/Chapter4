package com.gareth;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Location loc = new Location("Africa");
        System.out.println(loc.details());


        Country southAfrica = new Country("South Africa", "Rand", 1804, "Springbok", "English", "Africa");
        System.out.println(southAfrica.toString());
        System.out.println(southAfrica.details());


        LandMass land = southAfrica;
        System.out.println(land.mountain);


        CountryDetails deets = new CountryDetails("Zimbabwe", "Dollar", 1852);
        Nationality nat = new Nationality("Antelope", "English");
        CompositeCountry zim = new CompositeCountry(deets, nat);
        System.out.println(zim.toString());
    }
}
