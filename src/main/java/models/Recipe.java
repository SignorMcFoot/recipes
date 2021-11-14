package models;

import javax.persistence.*;
import java.util.HashSet;
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
    private final UUID id;
    @Column(name = "description")
    private final String description;
    @Column(name = "time")
    private final int time;


    public Recipe(String name, UUID id, String description, int time) {
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
