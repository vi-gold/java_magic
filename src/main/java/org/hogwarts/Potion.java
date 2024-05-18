package org.hogwarts;

import java.util.Arrays;
import java.util.Scanner;

public class Potion {
    public void prepare() {
        Scanner scanner = new Scanner(System.in);
        String[] ingredients  = {"Драконий коготь", "Лист мандрагоры", "Корень шершавой астрелии"};
        System.out.println("Добро пожаловать в лабораторию зелий!");
        System.out.println("Введите ингредиенты, которые у вас есть (через запятую): ");
        String input = scanner.nextLine();
        String[] userIngredients = input.split(", ");
        System.out.println("Array is: " + Arrays.toString(userIngredients));
        //---------
        // Method 1 (sort)
        //---------
        String[] ingredients2 = ingredients.clone();
        String[] userIngredients2 = userIngredients.clone();
        if (ingredients2.length == userIngredients2.length) {
            Arrays.sort(ingredients2);
            Arrays.sort(userIngredients2);
            if (Arrays.equals(ingredients2, userIngredients2)) {
                System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание.");
            } else {
                System.out.println("У вас не хватает некоторых ингредиентов. Нельзя приступать к созданию зелья.");

            }
        }
        //---------
        // Method 2 (Arrays)
        //---------
        int count = 0;
        for (int i = 0; i < ingredients.length; i++) {
            for (int j = 0; j < userIngredients.length; j++) {
                if (ingredients[i].equals(userIngredients[j])) {
                    count++;
                }
            }
        }
        if (count == ingredients.length) {
            System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание.");
        } else {
            System.out.println("У вас не хватает некоторых ингредиентов. Нельзя приступать к созданию зелья.");
        }


    }
}
