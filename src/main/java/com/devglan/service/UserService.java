/**
 * 
 */
package com.devglan.service;

import java.util.List;

import com.devglan.model.UserDetails;

public interface UserService {

	List<UserDetails> getUserDetails();

	UserDetails findById(Long id);

	UserDetails save(UserDetails user);

	UserDetails findByEmail(String email);

	void delete(Long id);
}
