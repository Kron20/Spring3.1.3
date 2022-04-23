package com.spring.springbootbootstrap.service;

import com.spring.springbootbootstrap.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    boolean saveUser(User user);

    User getUserById(Long id);

    void deleteUserById(Long id);

    UserDetails loadUserByUsername(String email);

    void editUser(User user);

    boolean existsById(Long id);

}
