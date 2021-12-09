package com.recipes.recipes.dao;

import com.recipes.recipes.models.Ingredient;
import com.recipes.recipes.mappers.IngredientMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("ingredientDao")
public class IngredientAccessService implements IngredientDao{


    @Override
    public int insertIngredient(UUID id, Ingredient ingredient) {
        return 0;
    }

    @Override
    public List<Ingredient> selectAllIngredients() {
        return null;
    }


    @Override
    public int deleteIngredientById(UUID id) {
        return 0;
    }

    @Override
    public Optional<Ingredient> selectIngredientByName(String ingredient) {
        return Optional.empty();
    }

    @Override
    public Optional<Ingredient> selectIngredientById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public int updateIngredient(UUID id, Ingredient newIngredient) {
        return 0;
    }
}
