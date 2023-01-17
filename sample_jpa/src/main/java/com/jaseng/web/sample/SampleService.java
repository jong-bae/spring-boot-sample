package com.jaseng.web.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@Autowired UserRepository userRepository;
	
	public List<User> getUser(int PARAM) {
		return userRepository.findByUserAge(PARAM);
	}
	
}
