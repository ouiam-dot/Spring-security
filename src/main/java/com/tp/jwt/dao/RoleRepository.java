package com.tp.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tp.jwt.bean.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	public Role findByAuthority(String authority);
}
