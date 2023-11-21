package net.guides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.guides.springboot.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByName(String name);

}
