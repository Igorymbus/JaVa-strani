package com.example.second_practic;

import java.io.Serializable;

public class State implements Serializable {
    private String name;
    private String capital;
    private int flagResource;

    public State(String name, String capital, int flag) {
        this.name = name;
        this.capital = capital;
        this.flagResource = flag;
    }

    public String getName() {
        return this.name;
    }

    public String getCapital() {
        return this.capital;
    }

    public int getFlagResource() {
        return this.flagResource;
    }
}