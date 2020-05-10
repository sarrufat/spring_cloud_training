package com.appsdeveloperblog.app.ws.userservice;

import com.appsdeveloperblog.app.ws.ui.model.request.UpdateUserDetailsModelRequest;
import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsModelRequest;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsModelRequest user);

    UserRest getUser(String userId);

    UserRest updateUser(String userId, UpdateUserDetailsModelRequest userDet);

    void deleteUser(String userId);
}
