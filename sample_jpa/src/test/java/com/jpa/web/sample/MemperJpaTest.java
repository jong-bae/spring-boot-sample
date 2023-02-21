package com.jpa.web.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemperJpaTest {

	@Autowired MemberRepository memberRepository;
	
	@Test
	public void insertTest() {
		String username = "샘플123";
		String email = "sample123@sample.co.kr";
		
		memberRepository.save(Member.builder()
				.email(username)
				.username(email)
				.build());
		
		
	}
}
