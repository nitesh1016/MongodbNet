package com.netflix.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.api.entity.UserLogin;
import com.netflix.api.service.UserLoginService;

@RestController
@RequestMapping("/api/userlogin")

public class UserLoginContoller {
	@Autowired
	UserLoginService usrService;
	
	@GetMapping("/getuser")
    public List<UserLogin> getUsers(){
		//List<Userbasic> lstUsr= usrService.getUsers();
       return usrService.getUsers();
	}
	@PostMapping("/postuser")
	public String addUser(@RequestBody UserLogin usr) {
		String message=usrService.addUser(usr);
		return message;
	}
	@PutMapping("/putuser/{userid}")
	public String updateUser(@RequestBody UserLogin usr, @PathVariable("userid") int id) {
		String message=usrService.updateUser(usr,id);
		return message;		
	}
	@DeleteMapping("/deleteuser/{userid}")
		public String deleteUser(@PathVariable("userid") int id)
		{
		String message=usrService.deleteUser(id);
		return message;
	}
}
