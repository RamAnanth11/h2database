package com.h2.dblearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2.dblearn.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
}