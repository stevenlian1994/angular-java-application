package com.codingdojo.mvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.codingdojo.mvc.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}