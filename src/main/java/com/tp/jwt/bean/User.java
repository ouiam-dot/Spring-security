package com.tp.jwt.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String password;
	private boolean accountNonExpired=true;
	private boolean accountNonLocked=true;
	private boolean credentialsNonExpired=true;
	private boolean enabled=true;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Role> authorities;
	
	
	
	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	
	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setAuthorities(List<Role> authorities) {
		this.authorities = authorities;
	}

	@Override
	public Collection<Role> getAuthorities() {
		if(authorities==null) {
			authorities = new ArrayList<Role>();
		}
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", accountNonExpired="
				+ accountNonExpired + ", accountNonLocked=" + accountNonLocked + ", credentialsNonExpired="
				+ credentialsNonExpired + ", enabled=" + enabled + "]";
	}
	
	

}
