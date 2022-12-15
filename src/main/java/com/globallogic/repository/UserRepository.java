package com.globallogic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

}
