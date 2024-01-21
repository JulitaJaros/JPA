package org.example.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
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

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasureModel unitOfMeasureModel;

}
