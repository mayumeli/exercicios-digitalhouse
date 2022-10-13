package com.unittest.mayumeli.unittest.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unittest.mayumeli.unittest.dto.UserDto;
import com.unittest.mayumeli.unittest.model.User;
import com.unittest.mayumeli.unittest.repository.UserRepo;

@Service
public class UserService implements IUser {
    @Autowired
    private UserRepo userRepo;
    
    @Override
    public List<User> getAllUsers() throws IOException {
        return userRepo.getAllUser();
    }

    @Override
    public UserDto createUser(User user) throws IOException {
        int id = userRepo.getAllUser().size() + 1;
        user.setId(id);
        userRepo.saveUser(user);
        return new UserDto(user);
    }
}
