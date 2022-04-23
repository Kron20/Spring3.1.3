package com.spring.springbootbootstrap.service;

import com.spring.springbootbootstrap.model.Role;
import com.spring.springbootbootstrap.model.User;
import java.util.List;
import java.util.Set;

public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByLogin(String email);

    User getUserById(long id);

    public Set<Role> getSetOfRoles(List<String> role_string);
}
