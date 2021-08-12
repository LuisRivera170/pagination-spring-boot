package com.example.pagination.utils;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import java.util.Locale;

public class Beans {

    @Bean
    public static Faker faker() {
        return new Faker(new Locale("es-MX"));
    }

}
