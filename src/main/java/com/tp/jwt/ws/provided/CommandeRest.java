package com.tp.jwt.ws.provided;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandeRest {

	@GetMapping("/admin/hello/name/{name}")
	public String sayHelloAdmin(@PathVariable String name) {
		return "mr7ba b admin f get "+name;
	}
	
	@GetMapping("/public/hello/name/{name}")
	public String sayHelloUser(@PathVariable String name) {
		return "mr7ba b public f get "+name;
	}
	
	@GetMapping("/hello/name/{name}")
	public String sayHello(@PathVariable String name) {
		return "mr7ba f get "+name;
	}
	
	@PostMapping("/admin/hello/name/{name}")
	public String sayHelloAdminPost(@PathVariable String name) {
		return "mr7ba b admin f get "+name;
	}
	
	@PostMapping("/public/hello/name/{name}")
	public String sayHelloUserPost(@PathVariable String name) {
		return "mr7ba b public f get "+name;
	}
	
	@PostMapping("/hello/name/{name}")
	public String sayHelloPost(@PathVariable String name) {
		return "mr7ba f get "+name;
	}
}
