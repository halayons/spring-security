package net.guides.springboot.service;

import java.util.List;

import net.guides.springboot.dto.UserDto;
import net.guides.springboot.entity.User;

public interface UserService {
	void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}
