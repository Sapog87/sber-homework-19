package org.sber.sberhomework19.service;

import lombok.RequiredArgsConstructor;
import org.sber.sberhomework19.entity.Ingredient;
import org.sber.sberhomework19.repository.IngredientJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientServiceImpl implements IngredientService {
    private final IngredientJpaRepository ingredientRepository;

    @Override
    public Ingredient saveIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public List<Ingredient> findAllIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    public Ingredient findById(Long id) {
        return ingredientRepository.findById(id).orElse(null);
    }
}
