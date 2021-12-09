package com.recipes.recipes.dao;

import com.recipes.recipes.models.Ingredient;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IngredientDao{
    int insertIngredient(UUID id, Ingredient ingredient);

    default int insertIngredient(Ingredient ingredient){
        UUID id = UUID.randomUUID();
        return insertIngredient(id, ingredient);
    }

    List<Ingredient> selectAllIngredients();

    int deleteIngredientById(UUID id);
    Optional<Ingredient> selectIngredientByName(String name);
    Optional<Ingredient> selectIngredientById(UUID uuid);

    int updateIngredient(UUID id, Ingredient newIngredient);
}
