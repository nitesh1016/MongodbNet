package com.netflix.api.service;

import com.netflix.api.entity.UserLogin;
import com.netflix.api.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserLoginService {
    @Autowired
    UserLoginRepository usrrepo;

    public List<UserLogin> getUsers() {
        //List<Userbasic> usrlist= usrrepo.findAll();
        return usrrepo.findAll();
    }

    public String addUser(UserLogin usr) {
        usrrepo.save(usr);
        return "User added Succesfully";
    }

    public String updateUser(UserLogin usr, int id) {
        Optional<UserLogin> usr1 = usrrepo.findById(id);
        if (usr1.isPresent()) {
            //usr1.get().setUserId(usr.getUserId());
            usr1.get().setName(usr.getName());
            usr1.get().setEmail(usr.getEmail());
            usrrepo.save(usr1.get());
            return "User sucessfully updated";
        } else {
            return "User is not found";
        }
    }

    public String deleteUser(int id) {
        Optional<UserLogin> usr1 = usrrepo.findById(id);
        if (usr1.isPresent()) {
            usrrepo.deleteById(id);
            return "User DEleted succesfully";
        } else {
            return "User is not found";
        }
    }

}
