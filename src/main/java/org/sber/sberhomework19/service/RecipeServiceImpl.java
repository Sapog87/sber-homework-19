package org.sber.sberhomework19.service;

import lombok.RequiredArgsConstructor;
import org.sber.sberhomework19.entity.Recipe;
import org.sber.sberhomework19.repository.RecipeJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {
    private final RecipeJpaRepository recipeRepository;

    @Override
    public List<Recipe> findAllRecipes() {
        return recipeRepository.findAll();
    }

    @Override
    public List<Recipe> findRecipesByNameLike(String name) {
        return recipeRepository.findByNameIgnoreCaseContaining(name);
    }

    @Override
    public void deleteRecipe(Recipe recipe) {
        recipeRepository.delete(recipe);
    }

    @Override
    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public Recipe findRecipeById(Long id) {
        return recipeRepository.findById(id).orElse(null);
    }
}
