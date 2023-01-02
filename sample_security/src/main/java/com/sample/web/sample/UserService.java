package com.sample.web.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

	@Autowired private UserRepository userRepository;
	@Autowired private PasswordEncoder passwordEncoder;
	

	public void signUser(UserDTO param) {
		UserEntity user = param.toUserEntity();
		user.hashPassword(passwordEncoder);
		userRepository.save(user);
	}

	@Override 
	public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
		UserEntity user = userRepository.findByUserEmail(userEmail);

		if (user == null) {
			return null;
		}

		UserDTO loginUser = new UserDTO(user.getUserEmail(), user.getUserName(), user.getPassword());

		return loginUser;
	}
	 
}
