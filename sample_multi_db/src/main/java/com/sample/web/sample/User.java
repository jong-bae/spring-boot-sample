package com.sample.web.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sample.web.sample.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_user", schema = "public" )
@NoArgsConstructor
@Getter
public class User {

	@Column(name="user_name")
	private String userName;
	
	@Id
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="user_age")
	private int userAge;

	@Builder
	public User(String userName, String userEmail, int userAge) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.userAge = userAge;
	}
}
