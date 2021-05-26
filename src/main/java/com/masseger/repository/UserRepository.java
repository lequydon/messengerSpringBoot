package com.masseger.repository;

import org.springframework.data.repository.CrudRepository;

import com.masseger.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	 User findByEmail(String email);
}
