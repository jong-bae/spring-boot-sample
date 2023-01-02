package com.sample.web.sample;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements UserDetails {

	private static final long serialVersionUID = 3742258611433522381L;
	
	private String userEmail;
	private String userName;
	private String password;
	
	public UserEntity toUserEntity() {
		return UserEntity.builder()
				.userEmail(userEmail)
				.userName(userName)
				.password(password)
				.build();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> collectors = new ArrayList<>();
		collectors.add(() -> {return "ROLES";});
		return collectors;
	}

	@Override
	public String getUsername() {
		return this.userEmail;
	}
	
	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
