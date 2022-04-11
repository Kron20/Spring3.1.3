package com.spring.springbootbootstrap.dao;

import com.spring.springbootbootstrap.model.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleDao {

    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
    public HashSet<Role> getSetOfRoles(String[] roleNames);
}
