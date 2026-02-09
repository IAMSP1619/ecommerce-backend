package com.telusko.ecommerce.controller;

import com.telusko.ecommerce.model.User;
import com.telusko.ecommerce.service.AuthService;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    private final AuthService authService;
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {
        String token = authService.login(user.getUsername());
        return Map.of("token", token);
    }
}

