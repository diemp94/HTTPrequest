package com.proyecto.diego.httprequest;

/**
 * Created by diego on 03/04/18.
 */

public class City {

    private int id;
    private String name;


    public City() {}


    public City(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
