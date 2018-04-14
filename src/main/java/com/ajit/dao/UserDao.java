package com.ajit.dao;

import com.ajit.model.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserDetails, Long> {

    UserDetails findByEmail(String email);

}
