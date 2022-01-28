package com.netflix.api.service;

import com.netflix.api.entity.UserAccountCreate;
import com.netflix.api.repository.UserAccountCreateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAccountCreateService {

    @Autowired
    UserAccountCreateRepository userAccountCreateRepository;

    public String postuseraccountcreate(UserAccountCreate userAccountCreate) {
        userAccountCreateRepository.save(userAccountCreate);
        return "User account created successfully";
    }

    public List<UserAccountCreate> getuseraccountcreate() {
        return userAccountCreateRepository.findAll();
    }
    public String updateuseraccountcreate(UserAccountCreate usr, long id) {
			Optional<UserAccountCreate> usr1 =userAccountCreateRepository.findById(id);
			if(usr1.isPresent())
			{
				usr1.get().setName(usr.getName());
				usr1.get().setEmail(usr.getEmail());
				usr1.get().setPassword(usr.getPassword());
				usr1.get().setCountry(usr.getCountry());
				userAccountCreateRepository.save(usr1.get());           
				return "User sucessfully updated";
			}
			else {
				return "User is not found";
			}
		}

		public String deleteUser(long id) {
			Optional<UserAccountCreate> usr1 =userAccountCreateRepository.findById(id); 
			if(usr1.isPresent())
			{
				userAccountCreateRepository.deleteById(id);
				return "User DEleted succesfully";
			}
			else 
			{
				return "User is not found";	
			}
			
		
		}
}
