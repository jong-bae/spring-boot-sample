package com.sample.web.sample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {

	UserEntity findByUserEmail(String userEmail);
}
