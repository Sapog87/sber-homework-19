package org.sber.sberhomework19.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class RecipeIngredientId {
    private Long recipeId;
    private Long ingredientId;
}
