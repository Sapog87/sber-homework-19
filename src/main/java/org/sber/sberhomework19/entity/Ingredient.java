package org.sber.sberhomework19.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "ingredient_id_gen")
    @SequenceGenerator(name = "ingredient_id_gen", sequenceName = "ingredient_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
    private String name;

    @OneToMany(mappedBy = "ingredient", fetch = FetchType.EAGER)
    private Set<RecipeIngredient> recipeIngredients = new LinkedHashSet<>();
}