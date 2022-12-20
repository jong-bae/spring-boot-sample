package com.sample.web.sample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	
	@Select("SELECT user_name from tb_user where user_age = 30")
	public String getUserName();
	
	public List<UserDTO> getFindAll();
}
