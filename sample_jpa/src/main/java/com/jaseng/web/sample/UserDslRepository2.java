package com.jaseng.web.sample;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;
import static com.jaseng.web.sample.QUser.user;

@RequiredArgsConstructor
@Repository
public class UserDslRepository2 {
	private final JPAQueryFactory qf;
	
	public List<User> findByUserName(String name) {
		return qf.selectFrom(user)
					.where(user.userName.eq(name))
					.fetch();
	}
}
