package com.exercicioaula.mayumeli.exercicioaula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicioaula.mayumeli.exercicioaula.model.UserBD;
import com.exercicioaula.mayumeli.exercicioaula.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserBD> saveNewUser(@RequestBody UserBD user) {
        UserBD newUser = service.save(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<UserBD>> findAllUsers() {
        Iterable<UserBD> users = service.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserBD> findUserById(@PathVariable long id) {
        UserBD user = service.findById(id).get();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserBD> deleteUserById(@PathVariable long id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<UserBD> updateUserById(@RequestBody UserBD user) {
        service.update(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
