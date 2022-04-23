package com.spring.springbootbootstrap.dao;

import com.spring.springbootbootstrap.model.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByLogin(String email);

    User getUserById(long id);
}
