package de.ronasoft.sprongboot.docker.app.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import de.ronasoft.sprongboot.docker.app.entity.User;
import de.ronasoft.sprongboot.docker.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userinfo")
public class UserController {

	@Autowired
	private UserService userService;

	// get all users info
	@GetMapping(value = "/alluser", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUsers() {
		return userService.getAllUserInfo();
	}
	
	@GetMapping(value = "/message", produces = MediaType.TEXT_HTML_VALUE)
	public String message(){
		return "Hello, von Userservice 1 - " + ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
	}

}
