package ru.javamentor.spring.boot.rest.service;

import ru.javamentor.spring.boot.rest.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
}
