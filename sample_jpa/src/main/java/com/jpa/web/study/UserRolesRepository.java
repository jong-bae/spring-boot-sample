package com.jpa.web.study;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author : JB
 * @packageName : com.jpa.web.study
 * @fileName : UserRolesRepository
 * @description :
 * @since : 2023-02-22
 */
public interface UserRolesRepository extends JpaRepository<UserRoles, Integer> {


    @Query("FROM user_roles as ur Left JOIN ur.roles as r Left join ur.users as u where u.name = :username")
    List<UserRoles> findAllUserRoles(@Param("username") String username);

    List<UserRoles> findByUsersName(String username);
}
