package com.jaseng.web.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity(name="member")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idx;
	
	@Column
	private String username;
	
	@Column
	private String email;

	@Builder
	public Member(String username, String email) {
		this.username = username;
		this.email = email;
	}
	
}
