package com.example.flightreservation.services;

import com.example.flightreservation.entities.User;

import java.util.List;

public interface userService {

    User findByEmail(String email);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();

}
