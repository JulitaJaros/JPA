package org.example.jpa.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class IngredienModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "amount")
    private BigDecimal amount;

    @ManyToOne
    private RecipeModel recipeModel;

}
