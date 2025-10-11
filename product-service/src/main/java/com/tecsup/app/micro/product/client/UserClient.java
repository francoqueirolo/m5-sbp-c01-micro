package com.tecsup.app.micro.product.client;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
//@AllArgsConstructor
@RequiredArgsConstructor
@Component
public class UserClient {

    private final RestTemplate restTemplate;

    @Value("${user.service.url}")
    private String userServiceUrl;

    public User getUserById(Long createdBy) {

        String url = userServiceUrl + "/api/users/" + createdBy;

        try {
            User usr = restTemplate.getForObject(url, User.class);
            log.info("User retrieved successfully from userdb: {}", usr);
            return usr;
        } catch (Exception e) {
            log.error("Error calling User Service: {}", e.getMessage());
            throw new RuntimeException("Error calling User Service: " + e.getMessage());
        }

    }


}
