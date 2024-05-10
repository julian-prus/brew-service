package com.prus.brew.repository;

import lombok.Builder;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Builder
public record Drink(String id, String name) {

    private static List<Drink> drinks = Arrays.asList(
            Drink.builder().id("1").name("Bonanza").build(),
            Drink.builder().id("2").name("Five Elephant").build()
    );

    public static Drink getByID(String id) {
        return drinks.stream()
                .filter(drink -> Objects.equals(drink.id, id))
                .findFirst()
                .orElse(Drink.builder().build());
    }
}
