package com.example.thymeleadcocktaillist.model;

public class CocktailModel {
    private String name;
    private int id;

    public CocktailModel(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
