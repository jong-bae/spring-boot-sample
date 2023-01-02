package com.sample.web.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user", schema = "public")
@Getter
@NoArgsConstructor
public class UserEntity {

	@Id
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	public UserEntity hashPassword(PasswordEncoder passwordEncoder) {
		this.password = passwordEncoder.encode(this.password);
		return this;
	}
	
	public boolean checkPassword(String plainPassword, PasswordEncoder passwordEncoder) {
		return passwordEncoder.matches(plainPassword, this.password);
	}

	@Builder
	public UserEntity(String userEmail, String userName, String password) {
		this.userEmail = userEmail;
		this.userName = userName;
		this.password = password;
	}
}
