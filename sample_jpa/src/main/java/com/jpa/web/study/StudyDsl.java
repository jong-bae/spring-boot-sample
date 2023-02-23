package com.jpa.web.study;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : JB
 * @packageName : com.jpa.web.study
 * @fileName : StudyDsl
 * @description :
 * @since : 2023-02-23
 */

@RequiredArgsConstructor
@Repository
public class StudyDsl {

    private final JPAQueryFactory jpaQueryFactory;

    public List<UserRoles> findAllUserRolesDsl(String username) {
        return jpaQueryFactory
                .select(QUserRoles.userRoles)
                .from(QUserRoles.userRoles)
                .leftJoin(QUserRoles.userRoles.roles, QRoles.roles).fetchJoin()
                .leftJoin(QUserRoles.userRoles.users, QUsers.users).fetchJoin()
                .where(QUsers.users.name.eq(username))
                .fetch();
    }
}
