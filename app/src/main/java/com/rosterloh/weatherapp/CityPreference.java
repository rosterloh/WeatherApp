package com.rosterloh.weatherapp;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Saves the users preferred city
 *
 * @author Richard Osterloh
 */
public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // London as the default city
    String getCity(){
        return prefs.getString("city", "London, UK");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
