package com.appsdeveloperblog.app.ws.shared;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class Utils {
    public String generateId() {
        return UUID.randomUUID().toString();
    }
}
