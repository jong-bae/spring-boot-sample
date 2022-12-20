package com.sample.web.sample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {

	// JPA
	List<User> findByUserEmailLike(String email);
	
	List<User> findByUserName(String userName);
}
