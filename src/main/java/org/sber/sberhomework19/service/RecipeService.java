package org.sber.sberhomework19.service;

import org.sber.sberhomework19.entity.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAllRecipes();

    List<Recipe> findRecipesByNameLike(String name);

    void deleteRecipe(Recipe recipe);

    Recipe saveRecipe(Recipe recipe);

    Recipe findRecipeById(Long id);
}
