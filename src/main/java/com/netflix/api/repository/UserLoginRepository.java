package com.netflix.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.netflix.api.entity.UserLogin;

@Repository
public interface UserLoginRepository extends MongoRepository<UserLogin, Integer> {

}
