package j8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Country{
    public enum Continent{AISA, EUROPE}
    String name;
    Continent region;
    public Country(String na, Continent reg){name=na;region=reg;}
    public String getName(){return name;}
    public Continent getRegion(){return region;}
}
public class Test {
     
     public static void main(String[] args) {
        List<Country> countries = Arrays.asList(
        		 new Country("Germany", Country.Continent.EUROPE),
        		 new Country("Italy", Country.Continent.EUROPE),
                new Country("Japan", Country.Continent.AISA)
               
                );
        Map<Country.Continent, List<String>> map = countries.stream()
                .collect(Collectors.groupingBy(Country::getRegion,
                        Collectors.mapping(Country::getName, Collectors.toList())));
        System.out.println(map);
    }//{AISA=[Japan], EUROPE=[Italy, Germany]}
}