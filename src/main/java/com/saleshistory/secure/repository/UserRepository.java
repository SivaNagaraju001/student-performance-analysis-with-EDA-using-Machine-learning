package com.saleshistory.secure.repository;
import org.springframework.data.repository.CrudRepository;

import com.saleshistory.secure.model.User;
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}