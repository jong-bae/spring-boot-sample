package com.jpa.web.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

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
    @Autowired private UsersRepository usersRepository;
    @Autowired private RoleRepository roleRepository;
    @Autowired private UserRolesRepository userRolesRepository;
    @Autowired private StudyDsl studyDsl;

    @DisplayName("데이터 입력")
    void insertData() {
        usersRepository.save(Users.builder().id(1).name("study@test.com").build());
        usersRepository.save(Users.builder().id(2).name("user@test.com").build());

        roleRepository.save(Roles.builder().id(1).name("ADMIN").build());
        roleRepository.save(Roles.builder().id(2).name("USER").build());

    }

    @Test
    @Transactional
    @DisplayName("연관관계 테스트")
    void findTest() {
        List<UserRoles> userRoles = userRolesRepository.findAllUserRoles("user@test.com");
        userRoles.forEach(data -> System.out.println(data.getRoles().getName()));

//         userRolesRepository.findByUsersName("user@test.com");
    }

    @Test
    @Transactional
    @DisplayName("User정보 확인 테스트")
    void findUser() {
        List<Users> users = usersRepository.findUserInfo();
        for(Users user : users) {
            for(UserRoles ur : user.getRoles()) {
                System.out.println(ur.getRoles().getName());
            }
        }

    }

    @Test
    @Transactional
    @DisplayName("User정보 확인 테스트2 - lambda")
    void findUser2() {
        List<Users> users = usersRepository.findUserInfo();
        users.forEach(user -> {
            user.getRoles().forEach(ur -> System.out.println(ur.getRoles().getName()));
        });

    }

    @Test
    @Transactional
    @DisplayName("DSL 쿼리 변환 테스트")
    void dslTest() {
        studyDsl.findAllUserRolesDsl("user@test.com");
    }

}
