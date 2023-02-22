package com.jpa.web.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * @author : JB
 * @packageName : com.jpa.web.study
 * @fileName : StudyTest
 * @description :
 * @since : 2023-02-22
 */

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class StudyTest {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired private RoleRepository roleRepository;

    @Autowired private UserRolesRepository userRolesRepository;

    @DisplayName("데이터 입력")
    void insertData() {
        usersRepository.save(Users.builder().id(1).name("study@test.com").build());
        usersRepository.save(Users.builder().id(2).name("user@test.com").build());

        roleRepository.save(Roles.builder().id(1).name("ADMIN").build());
        roleRepository.save(Roles.builder().id(2).name("USER").build());

    }

    @Test
    @DisplayName("연관관계 테스트")
    void findTest() {
        //List<UserRoles> userRoles =
         userRolesRepository.findAllUserRoles("user@test.com");
    }



}
