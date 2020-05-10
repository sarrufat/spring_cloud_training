package com.sarrufat.photo.app.users.userservice.impl;


import com.sarrufat.photo.app.users.ui.model.request.UpdateUserDetailsModelRequest;
import com.sarrufat.photo.app.users.ui.model.request.UserDetailsModelRequest;
import com.sarrufat.photo.app.users.ui.model.response.UserRest;
import com.sarrufat.photo.app.users.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shared.Utils;

import java.util.HashMap;
import java.util.Map;


@Service
public class UserServiceImpl implements UserService {

    private Utils utils;

    Map<String, UserRest> users = new HashMap<String, UserRest>();

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    private UserRest genUserRestFromRequest(UserDetailsModelRequest request) {
        UserRest userRest = new UserRest();
        userRest.setEmail(request.getEmail());
        userRest.setFirstName(request.getFirstName());
        userRest.setLastName(request.getLastName());
        userRest.setUserId(utils.generateId());
        return userRest;
    }

    @Override
    public UserRest createUser(UserDetailsModelRequest user) {
        final UserRest userRest = genUserRestFromRequest(user);
        users.put(userRest.getUserId(), userRest);

        return userRest;
    }

    @Override
    public UserRest getUser(String userId) {
        //  if (true)
        //     throw new UserServiceExcepction("My Error");
        if (users.containsKey(userId)) {
            return users.get(userId);
        } else {
            return null;
        }
    }

    @Override
    public UserRest updateUser(String userId, UpdateUserDetailsModelRequest userDet) {
        if (users.containsKey(userId)) {
            UserRest userRest = users.get(userId);
            userRest.setFirstName(userDet.getFirstName());
            userRest.setLastName(userDet.getLastName());
            return userRest;
        } else {
            return null;
        }
    }

    @Override
    public void deleteUser(String userId) {
        users.remove(userId);
    }


}
