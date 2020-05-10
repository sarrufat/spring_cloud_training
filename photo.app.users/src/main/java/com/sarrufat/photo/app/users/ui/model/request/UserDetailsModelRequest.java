package com.sarrufat.photo.app.users.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsModelRequest {

    @NotNull(message = "firstName cannot be empty")
    @Size(min=3)
    private String firstName;
    @NotNull(message = "lastName cannot be empty")
    private String lastName;
    @NotNull(message = "email cannot be empty")
    @Email
    private String email;
    @NotNull(message = "password cannot be empty")
    @Size(max = 16, min = 8, message = "Password must be between 8 and 16 characters length")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
