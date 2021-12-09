package com.recipes.recipes.service;

import com.recipes.recipes.dao.IngredientDao;
import com.recipes.recipes.models.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class IngredientService {

    private final IngredientDao ingredientDao;

    @Autowired
    public IngredientService(@Qualifier("ingredientDao") IngredientDao ingredientDao){
        this.ingredientDao = ingredientDao;
    }

    public int addIngredient(Ingredient ingredient){
        return ingredientDao.insertIngredient(ingredient);
    }

    public List<Ingredient> getAllIngredients(){
        return ingredientDao.selectAllIngredients();
    }

    public Optional<Ingredient> selectIngredientById (UUID id){
        return ingredientDao.selectIngredientById(id);
    }

    public int deleteIngredient(UUID uuid){
        return ingredientDao.deleteIngredientById(uuid);
    }

    public int updatePerson(UUID id, Ingredient newIngredient){
        return ingredientDao.updateIngredient(id, newIngredient);
    }

    public Optional<Ingredient> selectIngredientByName(String name){
        return ingredientDao.selectIngredientByName(name);
    }



}
