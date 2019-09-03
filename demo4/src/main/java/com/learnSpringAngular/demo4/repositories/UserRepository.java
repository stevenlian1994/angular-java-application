package com.learnSpringAngular.demo4.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learnSpringAngular.demo4.entities.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
//interface is an abstract class, other classes implement interfaces to use their tools
//extends is for making super - sub class relationships
// what is <User, Long> for?

//user Repository is subclass of crudrepo which means it inherits tools for doing...crud to User Table in DB
//since controller implements repo, controller now has the tools to do crud
//MVC model - Model is split into repositories and entitites; entities hold the model of the data, repos have the tools to 
//interact with data