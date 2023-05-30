package com.educandoweb.demo.config;


import com.educandoweb.demo.entities.User;
import com.educandoweb.demo.repositories.UserRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "988888878", "4563871");

        userRepository.saveAll(Arrays.asList(u1, u2)); //salve os dados no banco de dados




    }
}