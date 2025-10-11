package com.tecsup.app.micro.product.client;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@AllArgsConstructor
@Component
public class UserClient {

    private final RestTemplate restTemplate;

    public User getUserById(Long createdBy) {

        String url = "http://localhost:8081/api/users/" + createdBy;

        User usr = restTemplate.getForObject(url, User.class);

        log.info("User retrieved successfully from userdb: {}", usr);

        return usr;

        /*
        return User.builder()
                .name("John Doe")
                .build();
        */
    }


}
