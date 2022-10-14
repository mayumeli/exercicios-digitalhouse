package com.usertest.mayumeli.usertest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.usertest.mayumeli.usertest.dto.UserDto;
import com.usertest.mayumeli.usertest.model.User;
import com.usertest.mayumeli.usertest.repository.UserRepo;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    
    @InjectMocks
    private UserService service;

    @Mock
    private UserRepo repository;

    private User mayu;

    @BeforeEach
    void setup() {
        mayu = new User(1, "Mayumi", "mayu@hotmail.com", "123456");
    }

    @Test
    void testGetAllUsers() throws IOException {
        List<User> users = new ArrayList<>();
        users.add(mayu);
        BDDMockito.given(repository.getAllUser()).willReturn(users);

        List<User> result = service.getAllUsers();

        assertEquals(users, result);
    }

    @Test
    void testCreateUser() throws IOException {
        List<User> users = new ArrayList<>();
        users.add(mayu);
        BDDMockito.given(repository.getAllUser()).willReturn(users);

        mayu.setId(2);

        UserDto excpected = new UserDto(mayu);

        UserDto result = service.createUser(mayu);

        assertEquals(excpected, result);
    }
}
