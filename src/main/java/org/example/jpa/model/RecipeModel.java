package org.example.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RecipeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "prep_Time")
    private Integer prepTime;
    @Column(name = "cook_Time")
    private Integer cookTime;
    @Column(name = "serving")
    private Integer serving;
    @Column(name = "source")
    private String source;
    @Column(name = "url")
    private String url;
    @Column(name = "directions")
    private String directions;
    @Column(name = "image")
    @Lob
    private Byte[] image;
     @OneToOne(cascade = CascadeType.ALL)
    private NotesModel notesModel;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipeModel")
     private Set<IngredienModel> ingredients = new HashSet<>();

     @ManyToMany
     @JoinTable(name = "recipeModel_categoryModel",
             joinColumns = @JoinColumn(name = "recipeModel_id"),
    inverseJoinColumns = @JoinColumn(name = "categoryModel_id"))
    private Set<CategoryModel> categories = new HashSet<>();




}
