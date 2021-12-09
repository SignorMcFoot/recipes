package com.recipes.recipes.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Column(name = "name")
    private final String name;
    @Column(name = "id")
    @Id
    private final UUID id;
    @Column(name = "description")
    private final String description;
    @Column(name = "time")
    private final int time;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "recipe_ingredients",
            joinColumns = @JoinColumn(name = "recipe_id", referencedColumnName = "ingredients_id"))
    private Set<Ingredient> ingredients = new HashSet<>();

    public Recipe(
            @JsonProperty("name") String name,
            @JsonProperty("id") UUID id,
            @JsonProperty("description") String description,
            @JsonProperty("time") int time) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.time = time;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getTime() {
        return time;
    }
}
