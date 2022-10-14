// package com.usertest.mayumeli.usertest.integration;

// import java.io.IOException;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.web.servlet.MockMvc;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

// import com.fasterxml.jackson.databind.ObjectMapper;

// import lombok.extern.log4j.Log4j2;

// // @Log4j2
// @SpringBootTest
// @AutoConfigureMockMvc
// public class IntegrationTests {
    
//     @Autowired
//     private MockMvc mockMvc;

//     @Autowired
//     private ObjectMapper objectMapper;

//     @Test
//     void testingGetAllUsersRoute() throws Exception {
//         this.mockMvc.perform(
//                 get("/api/v1/user/all")
//                 )
//             .andExpect(status().isOk())
//             .andExpect(content().json("[{'id': 1, 'name': 'Mayumi', 'email': 'mayu@hotmail.com'}]"));
//     }
// }
