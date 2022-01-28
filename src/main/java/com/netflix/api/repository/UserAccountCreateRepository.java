package com.netflix.api.repository;

import com.netflix.api.entity.UserAccountCreate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountCreateRepository extends MongoRepository<UserAccountCreate, Long> {

}
