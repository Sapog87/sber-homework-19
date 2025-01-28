package org.sber.sberhomework19.commands;

import lombok.RequiredArgsConstructor;
import org.sber.sberhomework19.entity.Recipe;
import org.sber.sberhomework19.service.RecipeService;
import org.springframework.stereotype.Component;

import java.util.Scanner;

import static org.sber.sberhomework19.utils.ReadUnit.readLong;

@Component
@RequiredArgsConstructor
public class DeleteRecipeCommand implements ConsoleCommand {
    private final RecipeService recipeService;
    private final Scanner scanner;

    @Override
    public String getText() {
        return "Удалить рецепт";
    }

    @Override
    public void execute() {
        long recipeId = readLong(scanner, "Введите номер рецепта: ");

        Recipe recipe = recipeService.findRecipeById(recipeId);
        if (recipe == null) {
            System.out.println("Такого рецепта не существует");
            return;
        }

        recipeService.deleteRecipe(recipe);
        System.out.println("Рецепт удален");
    }
}