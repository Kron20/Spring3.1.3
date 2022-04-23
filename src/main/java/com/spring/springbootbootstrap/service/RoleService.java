package com.spring.springbootbootstrap.service;


import com.spring.springbootbootstrap.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    void saveRole(Role role);

    Role getRoleById(Long id);

    void deleteRoleById(Long id);

    Role getRole(String role);

}
