package com.sample.web.sample;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProjectTest {

	@Autowired private UserRepository userRepo;
	@Autowired private UserMapper userMapper;
	
	@Test
	void jpaTest() {
		List<User> result = userRepo.findByUserName("박놀부");
		
		for(User u : result) {
			System.out.println(u.getUserEmail());
		}
	}
	
	@Test
	void mybatisTest() {
		String result = userMapper.getUserName();
		System.out.println(result);
		
		List<UserDTO> resultList = userMapper.getFindAll();
		for(UserDTO u : resultList) {
			System.out.println(u.getUserEmail());
		}
	}
	
	@Test
	void transactionTest() {
		userRepo.save(User.builder()
				.userEmail("test@sample.com")
				.userAge(35)
				.userName("샘플이름")
				.build());
		
		List<UserDTO> resultList = userMapper.getFindAll();
		for(UserDTO u : resultList) {
			System.out.println(u.getUserEmail());
		}
	}
	
	
}
