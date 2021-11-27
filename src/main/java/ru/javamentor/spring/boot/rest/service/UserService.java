package ru.javamentor.spring.boot.rest.service;

import ru.javamentor.spring.boot.rest.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getUsers();

    User getUserByLogin(String login);

    User getUserById(long id);
}
