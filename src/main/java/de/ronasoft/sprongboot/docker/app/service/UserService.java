package de.ronasoft.sprongboot.docker.app.service;

import java.util.ArrayList;
import java.util.List;

import de.ronasoft.sprongboot.docker.app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.ronasoft.sprongboot.docker.app.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUserInfo() {
		List<User> userList = new ArrayList<>();
		User userObj1 = new User("111", "User1");
		User userObj2 = new User("222", "User2");
		userList.add(userObj1);
		userList.add(userObj2);
		userRepository.save(userList);
		return userRepository.findAll();
	}
}
