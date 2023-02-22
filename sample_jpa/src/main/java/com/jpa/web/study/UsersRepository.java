package com.jpa.web.study;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : JB
 * @packageName : com.jpa.web.study
 * @fileName : UserRepository
 * @description :
 * @since : 2023-02-22
 */


public interface UsersRepository extends JpaRepository<Users, Integer> {
}
