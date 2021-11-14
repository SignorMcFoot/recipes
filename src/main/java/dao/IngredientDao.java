package dao;

import models.Ingredient;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IngredientDao {
    int insertIngredient(UUID id, Ingredient ingredient);

    default int insertIngredient(Ingredient ingredient){
        UUID id = UUID.randomUUID();
        return insertIngredient(id, ingredient);
    }

    List<Ingredient> selectAllIngredients();

    int deleteIngredientById(UUID id);
    int delteIngredientByName(Ingredient ingredient);
    Optional<Ingredient> selectIngredientById(UUID uuid);

}
