package com.usertest.mayumeli.usertest.service;

import java.io.IOException;
import java.util.List;

import com.usertest.mayumeli.usertest.dto.UserDto;
import com.usertest.mayumeli.usertest.model.User;

public interface IUser {
    List<User> getAllUsers() throws IOException;
    UserDto createUser(User user) throws IOException;
}
