package com.usertest.mayumeli.usertest.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usertest.mayumeli.usertest.dto.UserDto;
import com.usertest.mayumeli.usertest.model.User;
import com.usertest.mayumeli.usertest.service.IUser;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private IUser service;

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody User user) throws IOException {
        return new ResponseEntity<>(service.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser() throws IOException {
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }
}
