package com.codingdojo.mvc;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.codingdojo.mvc.entities.User;
import com.codingdojo.mvc.repositories.UserRepository;

@SpringBootApplication
public class SpringAngularApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringAngularApplication.class, args);
    }
 
    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@domain.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }
}