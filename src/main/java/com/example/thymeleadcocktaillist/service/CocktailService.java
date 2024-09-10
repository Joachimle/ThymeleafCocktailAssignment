package com.example.thymeleadcocktaillist.service;

import com.example.thymeleadcocktaillist.model.CocktailModel;
import com.example.thymeleadcocktaillist.repository.CocktailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {
    private final CocktailRepository cocktailRepository;

    public CocktailService(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    public List<CocktailModel> getCocktails(){
        return cocktailRepository.getCocktails();
    }

    public CocktailModel getCocktailByName(String name) {
        // TODO
        return null;
    }
}
