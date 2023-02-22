package com.jpa.web.study;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : JB
 * @packageName : com.jpa.web.study
 * @fileName : RoleRepository
 * @description :
 * @since : 2023-02-22
 */
public interface RoleRepository extends JpaRepository<Roles, Integer> {
}
