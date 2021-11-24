package ru.javamentor.spring.boot.rest.dao;

import ru.javamentor.spring.boot.rest.model.Role;

import java.util.List;


public interface RoleDao {
    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
}
