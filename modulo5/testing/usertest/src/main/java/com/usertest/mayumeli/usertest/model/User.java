package com.usertest.mayumeli.usertest.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private int id;

    @NotBlank
    @Size(min = 3, max = 20)
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;
}
