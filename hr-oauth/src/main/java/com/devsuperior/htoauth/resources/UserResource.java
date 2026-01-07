package com.devsuperior.htoauth.resources;

import com.devsuperior.htoauth.entities.User;
import com.devsuperior.htoauth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) throws IllegalAccessException {
        User user = service.findByEmail(email);
        return ResponseEntity.ok(user);
    }
}
