package com.exercicioaula.mayumeli.exercicioaula.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicioaula.mayumeli.exercicioaula.model.UserBD;
import com.exercicioaula.mayumeli.exercicioaula.repository.UserRepo;

@Service
public class UserService {
    
    @Autowired
    private UserRepo repo;

    public UserBD save(UserBD user) {
        return repo.save(user);
    }

    public void update(UserBD user) {
        repo.save(user);
    }

    public Optional<UserBD> findById(long id) {
        return repo.findById(id);
    }

    public Iterable<UserBD> findAll() {
        return repo.findAll();
    }

    public void deleteById(long id) {
        repo.deleteById(id);
    }
}
