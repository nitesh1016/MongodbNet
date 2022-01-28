package com.netflix.api.controller;

import com.netflix.api.entity.UserAccountCreate;
import com.netflix.api.service.UserAccountCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/useraccountcreate")
public class UserAccountCreateController {
    @Autowired
    UserAccountCreateService userAccountCreateService;

    @PostMapping("/postuser")
    public String addUser(@RequestBody UserAccountCreate userAccountCreate) {
        String post = userAccountCreateService.postuseraccountcreate(userAccountCreate);
        return post;
    }

    @GetMapping("/getuser")
    public List<UserAccountCreate> getUser() {
        return userAccountCreateService.getuseraccountcreate();
    }

     @PutMapping("/updateuser/{userid}")
	public String updateUser(@RequestBody UserAccountCreate usr,@PathVariable("userid") long id) {
		String message=userAccountCreateService.updateuseraccountcreate(usr,id);
		return message;		
	}
	@DeleteMapping("/deleteuser/{userid}")
		public String deleteUser(@PathVariable("userid") long id)
		{
		String message=userAccountCreateService.deleteUser(id);
		return message;
	}
}
