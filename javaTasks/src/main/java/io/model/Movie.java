package io.model;

import java.io.Serializable;

public class Movie implements Serializable {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
