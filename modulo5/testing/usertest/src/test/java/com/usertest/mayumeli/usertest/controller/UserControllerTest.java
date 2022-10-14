package com.usertest.mayumeli.usertest.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.usertest.mayumeli.usertest.dto.UserDto;
import com.usertest.mayumeli.usertest.model.User;
import com.usertest.mayumeli.usertest.service.UserService;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(UserController.class)
public class UserControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    // este objeto "bean" tem algumas coisas do spring
    // somente no controller podemos precisar do mockbean
    @MockBean
    private UserService service;

    private User mayu;

    @BeforeEach
    void setup() {
        mayu = new User(1, "Mayumi", "mayu@hotmail.com", "123456");
    }

    @Test
    public void callingGetAllUsersShouldReturnAllUsers() throws Exception {
        List<User> users = new ArrayList<>();
        users.add(mayu);
        BDDMockito.given(service.getAllUsers()).willReturn(users);
        
        this.mockMvc.perform(get("/api/v1/user/all"))
            .andExpect(status().isOk())
            .andExpect(content().json("[{'id': 1, 'name': 'Mayumi', 'email': 'mayu@hotmail.com'}]"));
    }

    @Test
    public void callingCreateUserShouldReturnCreatedUser() throws Exception {
        BDDMockito.given(service.createUser(any())).willReturn(new UserDto(mayu));

        String json = objectMapper.writeValueAsString(mayu);
        
        this.mockMvc
            .perform(
                post("/api/v1/user/create")
                    .content(json)
                    .contentType(MediaType.APPLICATION_JSON)
                )
            .andExpect(status().isCreated())
            .andExpect(content().json("{'id': 1, 'name': 'Mayumi', 'email': 'mayu@hotmail.com'}"));
    }
}
