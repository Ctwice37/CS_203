package lab_4;

import java.util.*;

public class City implements Comparable<City>{
   private String cityName;
   private double temperature;


    public City(String cityName, double temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return (int) (temperature - o.temperature);
    }

    public static void main(String[] args) {
        City c1 = new City("Minneapolis", 88.8);
        City c2 = new City("Detroit", 100);
        City c3 = new City("Denver", 23.9);
        City c4 = new City("New Orleans", 88.8);

        ArrayList<City> cities = new ArrayList<>();
        cities.add(c1);
        cities.add(c2);
        cities.add(c3);
        cities.add(c4);

        for(City c : cities)
            System.out.println(c);

        System.out.println("______________");

        Collections.sort(cities);

        for(City c: cities)
            System.out.println(c);

    }
}
