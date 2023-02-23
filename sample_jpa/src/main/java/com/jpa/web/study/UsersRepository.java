package com.jpa.web.study;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author : JB
 * @packageName : com.jpa.web.study
 * @fileName : UserRepository
 * @description :
 * @since : 2023-02-22
 */


public interface UsersRepository extends JpaRepository<Users, Integer> {

    @Query("From users u left join u.roles r")
    List<Users> findUserInfo();
}
