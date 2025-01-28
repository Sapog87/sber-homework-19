package org.sber.sberhomework19.commands;

import lombok.RequiredArgsConstructor;
import org.sber.sberhomework19.entity.Recipe;
import org.sber.sberhomework19.service.RecipeService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

import static org.sber.sberhomework19.utils.ReadUnit.readString;

@Component
@RequiredArgsConstructor
public class FindRecipesByNameCommand implements ConsoleCommand {
    private final RecipeService recipeService;
    private final Scanner scanner;

    @Override
    public String getText() {
        return "Найти рецепты по имени";
    }

    @Override
    public void execute() {
        String name = readString(scanner, "Введите название рецепта, или его часть: ");

        List<Recipe> recipes = recipeService.findRecipesByNameLike(name);
        System.out.println("----------------");
        if (recipes.isEmpty()) {
            System.out.println("Пусто");
        } else {
            recipes.forEach(recipe ->
                    System.out.printf("%d | %s%n", recipe.getId(), recipe.getName())
            );
        }
        System.out.println("----------------");
    }
}
