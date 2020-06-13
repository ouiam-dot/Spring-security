package com.tp.jwt.service.impl;

import com.tp.jwt.bean.Role;
import com.tp.jwt.dao.RoleRepository;
import com.tp.jwt.service.facade.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleRepository roleRepository;

	@Override
	public Role save(Role role) {
		Role loadedRole=roleRepository.findByAuthority(role.getAuthority());
		if(loadedRole==null) {
			roleRepository.save(role);
			return role;
		}
		return loadedRole;
	}

}
