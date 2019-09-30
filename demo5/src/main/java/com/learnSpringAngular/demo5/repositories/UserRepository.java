package com.learnSpringAngular.demo5.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learnSpringAngular.demo5.entities.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
