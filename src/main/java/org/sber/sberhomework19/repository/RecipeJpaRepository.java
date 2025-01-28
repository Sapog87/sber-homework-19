package org.sber.sberhomework19.repository;

import org.sber.sberhomework19.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeJpaRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByNameIgnoreCaseContaining(String name);
}
