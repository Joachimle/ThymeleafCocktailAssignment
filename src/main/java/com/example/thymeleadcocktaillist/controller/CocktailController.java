package com.example.thymeleadcocktaillist.controller;

import com.example.thymeleadcocktaillist.model.CocktailModel;
import com.example.thymeleadcocktaillist.service.CocktailService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class CocktailController {
    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("/cocktail")
    public String viewCocktail(@RequestParam("name") String name, Model model){
        CocktailModel cocktail = cocktailService.getCocktailByName(name);
        model.addAttribute("cocktail", cocktail);
        return "cocktail-detail";
    }

    @GetMapping("/")
    public String listCocktails(Model model){
        List<CocktailModel> cocktails = cocktailService.getCocktails();
        model.addAttribute("cocktails", cocktails);
        return "cocktail-list";
    }
}
