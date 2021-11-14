package dao;

import models.Ingredient;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
    public int delteIngredientByName(Ingredient ingredient) {
        return 0;
    }

    @Override
    public Optional<Ingredient> selectIngredientById(UUID uuid) {
        return Optional.empty();
    }
}
