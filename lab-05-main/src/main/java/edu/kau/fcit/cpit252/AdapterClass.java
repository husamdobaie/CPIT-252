package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.*;
import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.geoLocation.Location;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class AdapterClass implements WeatherGeo, WeatherCity {

    @Override
    public String getWeatherInfo(double latitude, double longitude) {

        return getWeatherInfo(new GeoLocation().search(latitude, longitude));
    }

    @Override
    public String getWeatherInfo(String city) {
        WeatherDBI a = new WeatherDBI();

        return a.getWeatherInfo(city);
    }

}
