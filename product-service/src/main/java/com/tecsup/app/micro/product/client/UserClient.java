package com.tecsup.app.micro.product.client;

import org.springframework.stereotype.Component;

@Component
public class UserClient {

    public User getUserById(Long createdBy) {
        return User.builder()
                .name("John Doe")
                .build();
    }

}
