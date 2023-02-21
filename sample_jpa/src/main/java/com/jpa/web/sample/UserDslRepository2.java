package com.jpa.web.sample;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;
import static com.jpa.web.sample.QUser.user;

@RequiredArgsConstructor
@Repository
public class UserDslRepository2 {
	
	private final JPAQueryFactory qf;
	
	// queryDSL
	public List<User> findByUserName(String name) {
		return qf.selectFrom(user)
					.where(user.userName.eq(name))
					.fetch();
	}
}
