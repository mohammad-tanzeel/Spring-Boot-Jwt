package com.tanzeel.jwtTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import com.tanzeel.jwtTest.dao.UserDa;
import com.tanzeel.jwtTest.model.User;

@Repository
public interface  UserRepository extends CrudRepository<User, Integer>  {
	
	User findByUsername(String username);

}
