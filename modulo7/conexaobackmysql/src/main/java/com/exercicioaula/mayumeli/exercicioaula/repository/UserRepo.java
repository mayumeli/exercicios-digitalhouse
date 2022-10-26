package com.exercicioaula.mayumeli.exercicioaula.repository;

import org.springframework.data.repository.CrudRepository;

import com.exercicioaula.mayumeli.exercicioaula.model.UserBD;

// CrudRepository - métodos básicos
// JpaRepository - métodos avançados
public interface UserRepo extends CrudRepository<UserBD, Long> {
    
}
