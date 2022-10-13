package com.unittest.mayumeli.unittest.service;

import java.io.IOException;
import java.util.List;

import com.unittest.mayumeli.unittest.dto.UserDto;
import com.unittest.mayumeli.unittest.model.User;

public interface IUser {
    List<User> getAllUsers() throws IOException;
    UserDto createUser(User user) throws IOException;
}
