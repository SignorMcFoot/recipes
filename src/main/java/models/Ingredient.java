package models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
@Entity
@Table(name="ingredients")
public class Ingredient {


    @ManyToMany(mappedBy = "recipes")
    private Set<Recipe> recipes = new HashSet<>();
    @Column(name = "name")
    private final String name;
    @Column(name = "quantity")
    private final int quantity;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingredient_id")
    private final UUID id;

    public Ingredient(String name, int quantity, String measurement, UUID id) {
        this.name = name;
        this.quantity = quantity;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    

    public UUID getId() {
        return id;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }
}