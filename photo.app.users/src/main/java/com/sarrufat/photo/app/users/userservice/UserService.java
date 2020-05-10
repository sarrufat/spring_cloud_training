package com.sarrufat.photo.app.users.userservice;


import com.sarrufat.photo.app.users.ui.model.request.UpdateUserDetailsModelRequest;
import com.sarrufat.photo.app.users.ui.model.request.UserDetailsModelRequest;
import com.sarrufat.photo.app.users.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsModelRequest user);

    UserRest getUser(String userId);

    UserRest updateUser(String userId, UpdateUserDetailsModelRequest userDet);

    void deleteUser(String userId);
}
