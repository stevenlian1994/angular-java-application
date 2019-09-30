package com.learnSpringAngular.demo5;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.learnSpringAngular.demo5.entities.User;
import com.learnSpringAngular.demo5.repositories.UserRepository;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo5Application.class, args);
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
