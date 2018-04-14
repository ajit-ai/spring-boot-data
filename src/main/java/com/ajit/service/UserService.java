/**
 *
 */
package com.ajit.service;

import com.ajit.model.UserDetails;

import java.util.List;

public interface UserService {

    List<UserDetails> getUserDetails();

    UserDetails findById(Long id);

    UserDetails save(UserDetails user);

    UserDetails findByEmail(String email);

    void delete(Long id);
}
