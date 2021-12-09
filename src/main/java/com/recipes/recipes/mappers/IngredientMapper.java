package com.recipes.recipes.mappers;

import com.recipes.recipes.models.Ingredient;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class IngredientMapper implements RowMapper<Ingredient> {

    @Override
    public Ingredient mapRow(ResultSet rs, int rowNum) throws SQLException {
        Ingredient ingredient = new Ingredient(
                rs.getString("name"),
                Integer.parseInt(rs.getString("quantity")),
                UUID.fromString(rs.getString("id")));
        return ingredient;
    }
}
