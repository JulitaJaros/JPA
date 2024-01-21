package org.example.jpa.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class CategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<RecipeModel> recipeModel;



}
