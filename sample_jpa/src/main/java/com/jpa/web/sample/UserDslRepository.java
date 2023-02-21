package com.jpa.web.sample;

import java.util.List;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;
import static com.jpa.web.sample.QUser.user;

@RequiredArgsConstructor
public class UserDslRepository implements UserDslCustom {

	private final JPAQueryFactory queryFactory;
	
	// QueryDSL
	public List<User> findByUserName(String name) {
		return queryFactory.selectFrom(user)
							.where(user.userName.eq(name))
							.fetch();
		
	}

}
