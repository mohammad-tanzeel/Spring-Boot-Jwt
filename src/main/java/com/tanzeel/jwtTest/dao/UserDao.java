package com.tanzeel.jwtTest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tanzeel.jwtTest.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
	UserDao findByUsername(String username);
}

