package com.usertest.mayumeli.usertest.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.usertest.mayumeli.usertest.model.User;

@Repository
public class UserRepo {
    private final String linkFile = "src/main/resources/users.json";
    ObjectMapper mapper = new ObjectMapper();
    ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

    public List<User> getAllUser() throws IOException {
        List<User> users = null;
        try {
            users = Arrays.asList(mapper.readValue(new File(linkFile), User[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public void saveUser(User user) throws IOException {
        List<User> users = getAllUser();
        users = new ArrayList<>(users);
        users.add(user);
        try {
            writer.writeValue(new File(linkFile), users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
