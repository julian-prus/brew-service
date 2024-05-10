package com.prus.brew.repository.service;


import com.prus.brew.repository.Drink;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CoffeeService {


    @QueryMapping
    public Drink drinkById(@Argument String id){
        return Drink.getByID(id);
    }

}
