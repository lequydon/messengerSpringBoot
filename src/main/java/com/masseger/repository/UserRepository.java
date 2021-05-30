package com.masseger.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masseger.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	 User findByEmail(String email);
}
