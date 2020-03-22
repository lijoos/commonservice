package com.LJ.Spring.commonService.Service;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.LJ.Spring.commonService.Dto.User;

public interface UserRepository extends MongoRepository<User,Integer> {
    public List<User> findByName(String name);

}
