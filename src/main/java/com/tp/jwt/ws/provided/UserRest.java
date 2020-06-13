package com.tp.jwt.ws.provided;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.jwt.bean.User;
import com.tp.jwt.service.aspect.security.JwtUtil;
import com.tp.jwt.service.facade.UserService;

@RestController
@RequestMapping("/security-api/user")
public class UserRest {

	
	@Autowired
	UserService userService;

	@GetMapping("/username/{username}")
	public UserDetails loadUserByUsername(@PathVariable String username) throws UsernameNotFoundException {
		return userService.loadUserByUsername(username);
	}


	@PostMapping("/")
	public int saveWithRoles(@RequestBody User user) {
		return userService.saveWithRoles(user);
	}

	@PostMapping("authetificate/login/{login}/pass/{pass}")
	public String sayHelloAdmin(@PathVariable String login,@PathVariable String pass) {
		return userService.authentificate(login, pass);
	}

}
