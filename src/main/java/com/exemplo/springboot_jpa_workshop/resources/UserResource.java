package com.exemplo.springboot_jpa_workshop.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.springboot_jpa_workshop.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Analu Sophia Maya Rezende", "analu_sophia_rezende@gconsult.com.br", "(82) 2624-6589", "MbyK8nN19S");
        return ResponseEntity.ok().body(user);
    }
}
