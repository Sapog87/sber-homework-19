package org.sber.sberhomework19.repository;

import org.sber.sberhomework19.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientJpaRepository extends JpaRepository<Ingredient, Long> {
}
