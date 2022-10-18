package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class App {
    public static void main(String[] args) {
        // Jeddah => 21.543333, 39.172778

        WeatherGeo WGeo = new AdapterClass();
        WeatherCity WCity = new AdapterClass();
        System.out.println(WGeo.getWeatherInfo(21.543333, 39.172778));
        System.out.println(WCity.getWeatherInfo("Jeddah"));
    }
}
