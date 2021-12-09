package com.recipes.recipes.API;

import com.sun.istack.NotNull;
import com.recipes.recipes.models.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.recipes.recipes.service.IngredientService;

import java.util.List;
import java.util.UUID;

@RequestMapping("/ingredient")
@RestController
public class IngredientController {

    private final IngredientService ingredientService;

    @Autowired
    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
    @PostMapping
    public void addIngredient(@NotNull @RequestBody Ingredient ingredient){
        ingredientService.addIngredient(ingredient);
    }
    @GetMapping
    public List<Ingredient> getAllIngredients(){
        return ingredientService.getAllIngredients();
    }

    @GetMapping(path = "{id}")
    public Ingredient getIngredientById(@PathVariable("id") UUID uuid){
        return ingredientService.selectIngredientById(uuid).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteIngredientById(UUID uuid){
        ingredientService.deleteIngredient(uuid);
    }

    @PutMapping(path = "{id}")
    public void updateIngredient(@PathVariable("id") UUID path, @NotNull Ingredient ingredient){

    }

}
