package com.spring.springbootbootstrap.service;

import com.spring.springbootbootstrap.model.Role;

import java.util.HashSet;
import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    public HashSet<Role> getSetOfRoles(String[] roleNames);

    void addRole(Role role);
}
