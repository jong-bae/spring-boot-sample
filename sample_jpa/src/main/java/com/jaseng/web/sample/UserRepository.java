package com.jaseng.web.sample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<User, String>, UserDslCustom {

	// JPA
	List<User> findByUserEmailLike(String email);
	
	// JPA METHOD Entity Mapping
	List<User> findByUserAge(int age);
	
	// JPQL Entity Mapping Query
	@Query("select u from User u where user_email like '%test%' and user_age = ?1")
	List<User> findByUserAge2(int age);

	// JPQL Entity Mapping Query @param
	@Query("select u from User u where user_email like '%test%' and user_age = :age")
	List<User> findByUserAge3(@Param("age") int age);
	
	// JPQL Native Query
	@Query(value = "select * from \"TB_USER\" where user_name like '%홍%' ", nativeQuery = true)
	List<User> findByUserName();
	
}
