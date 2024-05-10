package com.prus.brew.repository.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest(CoffeeService.class)
class CoffeeServiceTest {

    @Autowired
    private GraphQlTester graphQlTester;


    @Test
    void shouldGetFirst(){
        graphQlTester.documentName("brewDetails")
                .variable("id", "1")
                .execute()
                .path("drinkById")
                .matchesJson("");

    }

}