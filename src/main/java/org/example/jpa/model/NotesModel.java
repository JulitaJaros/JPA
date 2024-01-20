package org.example.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class NotesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name ="recipeNotes" )
    private String recipeNotes;

    @OneToOne
    private RecipeModel recipeModel;

}
