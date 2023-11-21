package net.guides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.guides.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
