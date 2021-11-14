package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "recipes")
public class Recipe {

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "recipe_ingredients",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "ingredient_id")}
    )
    private final Set<Ingredient> ingredients = new HashSet<>();

    @Column(name = "name")
    private final String name;
    @Column(name = "id")
    @Id
    private final UUID id;
    @Column(name = "description")
    private final String description;
    @Column(name = "time")
    private final int time;

    @ManyToMany
    @JoinTable(name = "recipes_recipes",
            joinColumns = @JoinColumn(name = "recipe_id", referencedColumnName = "recipes_id"))
    private List<Ingredient> recipes;

    public List<Ingredient> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Ingredient> recipes) {
        this.recipes = recipes;
    }


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
