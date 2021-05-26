package com.masseger.repository;

import org.springframework.data.repository.CrudRepository;

import com.masseger.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	Role findByName(String name);
}