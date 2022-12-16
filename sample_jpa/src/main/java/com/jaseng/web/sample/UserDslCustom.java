package com.jaseng.web.sample;

import java.util.List;

public interface UserDslCustom {
	List<User> findByUserName(String name);
}
