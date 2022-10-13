package com.usertest.mayumeli.usertest.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.usertest.mayumeli.usertest.model.User;
import com.usertest.mayumeli.usertest.service.UserService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(UserController.class)
public class UserControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService service;

    @Test
    public void callingGetAllUsersShouldReturnAllUsers() throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Mayumi", "mayu@hotmail.com", "123456"));
        BDDMockito.given(service.getAllUsers()).willReturn(users);
        
        this.mockMvc.perform(get("/api/v1/user/all"))
            .andExpect(status().isOk())
            .andExpect(content().json("[{'id': 1, 'name': 'Mayumi', 'email': 'mayu@hotmail.com'}]"));
    }
}
