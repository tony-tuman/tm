package com.karmasoftonline.tm.repository;

import com.karmasoftonline.tm.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}