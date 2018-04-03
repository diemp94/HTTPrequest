package com.proyecto.diego.httprequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by diego on 03/04/18.
 */

public class Town {

    private int id;
    private City city;

    public Town() {}

    public Town(int id, City city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public static City parseJson(String response){
        Gson gson = new GsonBuilder().create();
        City city = gson.fromJson(response, City.class);
        return city;
    }
}
