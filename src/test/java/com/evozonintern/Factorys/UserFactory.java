package com.evozonintern.Factorys;

import com.evozonintern.Entitys.User;
import com.github.javafaker.Faker;

public class UserFactory {

    public static User generateUser(){

        User user = new User();
        Faker faker = new Faker();

        user.setFirstname(faker.firstName());
        user.setMiddlename(faker.name());
        user.setLastname(faker.lastName());
        user.setEmail(faker.firstName() + "@gmail.com");
        user.setPassword("parola11");

        return user;
    }

}
