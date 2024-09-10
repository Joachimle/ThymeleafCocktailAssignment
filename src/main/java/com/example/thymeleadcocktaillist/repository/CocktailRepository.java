package com.example.thymeleadcocktaillist.repository;

import com.example.thymeleadcocktaillist.model.CocktailModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CocktailRepository {
private int cocktailId = 1;
private final List<CocktailModel> cocktails = new ArrayList<>();

    public CocktailRepository() {
        populateCocktails();
    }

    public List<CocktailModel> getCocktails() {
        return cocktails;
    }

    private void populateCocktails(){
        cocktails.add(new CocktailModel(getCocktailId(), "Whiskey Sour"));
        cocktails.add(new CocktailModel(getCocktailId(), "French 75"));
        cocktails.add(new CocktailModel(getCocktailId(), "Bloody Mary"));
    }

    public int getCocktailId() {
        return cocktailId++;
    }

    public void setCocktailId(int cocktailId) {
        this.cocktailId = cocktailId;
    }

    public CocktailModel addCocktail(CocktailModel cocktail) {
        cocktail.setId(getCocktailId());
        cocktails.add(cocktail);
        return cocktail;
    }
}
