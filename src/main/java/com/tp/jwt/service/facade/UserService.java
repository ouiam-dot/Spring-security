package com.tp.jwt.service.facade;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.tp.jwt.bean.User;

public interface UserService extends UserDetailsService {

	public int saveWithRoles(User user);
	public String authentificate(String login, String pass) ;
}
