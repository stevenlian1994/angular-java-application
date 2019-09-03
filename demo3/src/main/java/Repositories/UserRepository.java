package Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Entities.User;
//@Repo is Class Annotation for your Java Beans so when you compile your code, spring knows which files to look for repo
@Repository 
public interface UserRepository extends CrudRepository<User, Long>  {
	
}
